package com.lmj.service;

import com.lmj.bean.User;
import com.lmj.dao.UserDao;
import com.lmj.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

//	private UserDao ud = new UserDaoImpl();
	private UserDao ud;
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public User getUserByInfo(User u) {
		return ud.getUserByInfo(u);
	}

}
