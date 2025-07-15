package com.tiarlei.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiarlei.dscommerce.entities.User;
import com.tiarlei.dscommerce.services.exceptions.ForbiddenException;

@Service
public class AuthService {
		
	@Autowired
	private UserService userService;
		
	public void validateSelfForAdmin(long userId) {
		User me = userService.authenticated();
		if(!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)) {
			throw new ForbiddenException("Access denied");
		}
	}

}
