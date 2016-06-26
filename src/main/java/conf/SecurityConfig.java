package conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import dao.UserDao;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDao).passwordEncoder( new Md5PasswordEncoder());
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
		.antMatchers("/fonts/**").permitAll()
		.antMatchers("/").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login").permitAll()
	    .usernameParameter("username")
	    .passwordParameter("password")
		.and().formLogin().defaultSuccessUrl("/catalog")
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

}