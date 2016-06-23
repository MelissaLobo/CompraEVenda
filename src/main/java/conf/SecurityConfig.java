package conf;

/**
 * @author MelissaLobo mellobomel@gmail.com
 */
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import dao.UserDao;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDao).passwordEncoder( new BCryptPasswordEncoder());
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers("/profileUser").hasRole("ADMIN")
		.antMatchers("/cart").hasRole("ADMIN")
		.antMatchers("/accountCreated").hasRole("ADMIN")
		.antMatchers("/addComment").hasRole("ADMIN")
		.antMatchers("/adressCreated").hasRole("ADMIN")
		.antMatchers("/newAdress").hasRole("ADMIN")
		.antMatchers("/newShop").hasRole("ADMIN")
		.antMatchers("/productCreated").hasRole("ADMIN")
		.antMatchers("/profileUser").hasRole("ADMIN")
		.antMatchers("/catalog").permitAll()
		.antMatchers("/newAccount").permitAll()
		.antMatchers("/index").permitAll()
		.antMatchers("/js/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/template").permitAll()
		.antMatchers("/fonts/**").permitAll()
		.antMatchers("/").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login").permitAll()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username, "0cc175b9c0f1b6a831c399e269772661", true, true, true, true,
				Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
	}

}