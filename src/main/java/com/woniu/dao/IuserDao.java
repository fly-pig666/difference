package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IuserDao {
	void save(User obj);
	List<User> findAll();
}
