package com.sikiedu.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.sikiedu.domain.User;
import com.sikiedu.utils.HibernateUtils;

public class SQLDao {

	//SQL������ѯ
	public void fun()
	{
		
		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		
		///////
		
		String sql = "select * from user";
		
		//����sql��ѯ����
		NativeQuery query = session.createSQLQuery(sql);
		//��װ����
		query.addEntity(User.class);
		//����list
		List<User> list = query.list();
		//���ܵ�һ����ֵ
		//query.uniqueResult();
		
		System.out.println(list.get(0).getUsername()+"--"+list.get(1).getUsername()
				+"--"+ list.get(2).getUsername()
				);
		
		///////
		beginTransaction.commit();
		session.close();
		
		
	}
	
	
	//SQL������ѯ
	public void fun2()
	{
			
		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		///////
		
		String sql = "select * from user where id = ?";
		NativeQuery query = session.createSQLQuery(sql);
		
		//��?��ֵ
		query.setParameter(1, "3");
		
		//�Զ���װΪuser
		query.addEntity(User.class);
		//Ψһ����ֵ
		User user = (User) query.uniqueResult();
		
		
		System.out.println(user);
		
		
		///////
		beginTransaction.commit();
		session.close();
			
			
	}
	
	
	//SQL��ҳ��ѯ
	public void fun3()
	{
			
		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		///////
		
		String sql = "select * from user limit ? , ?";
		NativeQuery query = session.createSQLQuery(sql);
		
		//��?��ֵ
		query.setParameter(1, 0);
		query.setParameter(2, 2);
		query.addEntity(User.class);
		//Ψһ����ֵ
		List<User> list = query.list();
		
		System.out.println(list + " --- " + list.get(0).getUsername() + "--" + list.get(1).getUsername());
		
		
		///////
		beginTransaction.commit();
		session.close();
			
			
	}	

	
}
