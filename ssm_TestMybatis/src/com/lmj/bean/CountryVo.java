package com.lmj.bean;

import java.util.List;

public class CountryVo extends Country{
	//��Ҫά��һ��User����
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public String toString() {
		//return "CountryVo [userList=" + userList + ", toString()=" + super.toString() + "]";
		
		return super.toString()  + "   userList = " + userList;
	}
}
