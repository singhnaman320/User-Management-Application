package com.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public UserDetailsService getUserDetailsService() {
		
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider getDaoAuthenticationProvider() {
		
		DaoAuthenticationProvider daoAuthenticationProvider= new DaoAuthenticationProvider();
		
		daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
		
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());
		
		return daoAuthenticationProvider;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		super.configure(auth);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.antMatchers("/admin/**")
		.hasRole("ADMIN")
		.antMatchers("/user/**")
		.hasRole("USER")
		.antMatchers("/**")
		.permitAll()
		.and()
		.formLogin()
		.loginPage("/signIn")
		.loginProcessingUrl("/login")
		.defaultSuccessUrl("/user/")
		.and()
		.csrf().disable();
	}

}
