package com.sikiedu.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;
	
	
	static {
		Configuration config = new Configuration().configure();
		//��ȡsessionFactory����
		sessionFactory = config.buildSessionFactory();
	}
	
	//���ȫ�µ�session
	public static Session getSession()
	{

		//��ȡsession
		Session session = sessionFactory.openSession();
		return session;
	}
	
	//
	public static Session getCurrentSesssion()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	
}
