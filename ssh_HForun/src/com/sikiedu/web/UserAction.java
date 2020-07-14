package com.sikiedu.web;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sikiedu.domain.User;
import com.sikiedu.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	public User user = new User();

	public String register() throws Exception {
		
		//�Զ���װUser
		//û�е������ֶ���װ
		user.setId(UUID.randomUUID().toString());
		//��������
		UserService userService = new UserService();
		userService.addUser(user);
		
		return "toLogin";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
}
