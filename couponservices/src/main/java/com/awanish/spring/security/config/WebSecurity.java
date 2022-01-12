package com.awanish.spring.security.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.awanish.spring.security.UserDetailServiceImpl;

@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailServiceImpl userdetailsServices;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userdetailsServices);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.httpBasic();
		http.formLogin();
		http.authorizeRequests().mvcMatchers(HttpMethod.GET, "/couponapi/coupons", "/", "/index")
				.hasAnyRole("USER", "ADMIN").mvcMatchers(HttpMethod.POST, "/couponapi/coupons").hasRole("ADMIN")
				.anyRequest().denyAll().and().csrf().disable();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
