package com.lmj.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lmj.model.Goods;
import com.lmj.model.User;

public class DButil {
	public static Map<String,User> UserMap = new HashMap<String,User>();
	
	public static List<Goods> goodsList = new ArrayList<Goods>();
	
	static {
		addUser(new User("123", "123", "��", 123, true));
		
		goodsList.add(new Goods("�㽶", "�й�", 10, 10));
		goodsList.add(new Goods("ƻ��", "����", 10, 30));
		goodsList.add(new Goods("����", "����", 20, 10));
		goodsList.add(new Goods("���ܹ�", "�й�", 10, 40));
	}
	
	private static void addUser(User user) {
		UserMap.put(user.getUsername(), user);
	}
}
