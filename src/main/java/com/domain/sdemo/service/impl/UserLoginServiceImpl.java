package com.domain.sdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.sdemo.mapper.UserMapper;
import com.domain.sdemo.model.User;
import com.domain.sdemo.service.UserLoginService;

@Service("UserLoginServiceImpl")
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	UserMapper userMapper;

	@Override
	public boolean checkUserLogin(String userId, String userPassword) {
		User user = userMapper.checkUserLogin(userId, userPassword);
		return !(user == null);
	}

}
