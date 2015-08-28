package com.lzg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzg.dao.IUserDao;
import com.lzg.entity.User;
import com.lzg.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	// 默认是RuntimeException 才会回滚
	// @Transactional(rollbackFor = { Exception.class })
	@Transactional(readOnly = true)
	public User findUser(User user) {
		return userDao.findUser(user);
	}
}
