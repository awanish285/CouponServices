package com.awanish.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.spring.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer> {

	Coupon findByCode(String code);

}
