package com.awanish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awanish.spring.model.Coupon;
import com.awanish.spring.repo.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	@Autowired
	CouponRepo couponrepo;
	
	//this method is used to create the coupon
	@RequestMapping(value="/coupons",method=RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon)
	{
		return couponrepo.save(coupon);
	}
	//this method is used to get the coupon details
	@RequestMapping(value="/coupons/{code}",method=RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code)
	{
		return couponrepo.findByCode(code);
	}

}
