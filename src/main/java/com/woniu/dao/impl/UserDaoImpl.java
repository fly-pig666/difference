package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IuserDao;
import com.woniu.pojo.User;
@Repository
public class UserDaoImpl implements IuserDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(User obj) {
		sessionFactory.openSession().save(obj);
	}
	@Override
	public List<User> findAll(){
		return sessionFactory.openSession().createCriteria(User.class).list();
		
	}

}
