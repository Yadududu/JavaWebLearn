package com.lmj.dao;

import java.util.List;

import com.lmj.bean.User;

public interface UserDao {
	//��
	void saveUser(User u);
	
	//ɾ
	void deleteUserById(Integer id);
	
	//��
	void updateUser(User u);
	
	//��
	//����id�����û�
	User selectUserById(Integer id);
	
	//����ȫ���û�List
	List<User> selectAllUser();
	
	//�����û�����
	Integer selectUserCount();
}
