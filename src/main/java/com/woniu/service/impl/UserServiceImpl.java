package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.woniu.dao.IuserDao;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;

public class UserServiceImpl implements IUserService {
      @Autowired
     IuserDao userDao;
	@Override
	public void save(User obj) {
		// TODO Auto-generated method stub
		userDao.save(obj);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
