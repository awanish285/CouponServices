package com.awanish.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CouponController {
	
	//this method is show the index page for login
	@GetMapping("/")
	public String index()
	{
		return "index";
	}

}
