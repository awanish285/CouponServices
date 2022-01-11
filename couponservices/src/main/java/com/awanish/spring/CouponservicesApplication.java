package com.awanish.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CouponservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponservicesApplication.class, args);
		
		
		//this is used to encript the password.
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "sunder";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		
	}

}
