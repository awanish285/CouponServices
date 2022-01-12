package com.awanish.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.awanish.spring.model.User;
import com.awanish.spring.repo.UserRepo;
@Service
public class UserDetailServiceImpl implements UserDetailsService {
   @Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username "+ username);
		User user = userRepo.findByEmail(username);
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				user.getRoles());
	}

}
