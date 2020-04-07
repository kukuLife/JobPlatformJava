package com.jobplatform.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
    UserMapper userMapper;
	
	public User getUser(String userId) {
		
		return userMapper.select(userId);
	}

}
