package conf;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter implements UserDetailsService {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this).passwordEncoder(new Md5PasswordEncoder());
	}
		
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("melissa").password("mel123").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN", "DBA");
	}

	/*@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/home").access("hasRole('ROLE_USER')").and().formLogin()
				.loginPage("/login").permitAll().loginProcessingUrl("/dologin").permitAll()
				.usernameParameter("username").passwordParameter("password").and().logout().logoutUrl("/logout")
				.logoutSuccessUrl("/index").permitAll();
	}*/

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/profileUser").access("hasRole('ROLE_USER')")
		.antMatchers("/cart").access("hasRole('ROLE_USER')")
		.antMatchers("/catalog").permitAll()
		.antMatchers("/").permitAll()
		.antMatchers("/index").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username, "0cc175b9c0f1b6a831c399e269772661", true, true, true, true,
				Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
	}

}