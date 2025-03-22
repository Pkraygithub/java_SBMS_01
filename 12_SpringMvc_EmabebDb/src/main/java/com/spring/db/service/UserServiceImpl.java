package com.spring.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.repositery.UserRepositery;
import com.spring.db.user.User;


@Service
public class UserServiceImpl implements IuserService {

	@Autowired
	private UserRepositery repositery;
	
	@Override
	public boolean saveUserDetains(User user) {

		User save = repositery.save(user);
		return save.getUid() != null;
		
	}

}
