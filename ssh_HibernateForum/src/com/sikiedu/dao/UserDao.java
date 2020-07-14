package com.sikiedu.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sikiedu.domain.User;
import com.sikiedu.utils.HibernateUtils;

public class UserDao {

	public void addUser() {
		
		
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		
		User user = new User();//=>û��id.û����session����   ˲ʱ״̬
		user.setName("lain");//=>û��id.û����session����   ˲ʱ״̬
		
		//�洢user���� save    ֻ��Ϊ������id
		session.save(user); //��id,��session����   �־û�״̬  ����:����״̬��ת��
							//��˲ʱ->�־�    Ŀ�� : ����id
		
		System.out.println(user.getId());//�����������id,�������ݻ�û���浽���ݿ�
		
		System.out.println("//////////////////////////////////////");
		//�ύ����
		transaction.commit();
		//�ر���Դ
		session.close();//û����session����,��id   ����̬
		
		System.out.println(user.getId());
		
	}
	

	public void deleteUser()
	{
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//�õ�idΪe02e172c-f7ea-4866-85a3-98cb5a0e9bc5�Ķ���
		User user = session.get(User.class, "4028818764d1723c0164d17240270000");
		session.delete(user);
		transaction.commit();
		System.out.println(user.getId());
		session.close();
		
	}
	
	public void ChangeUser()
	{
		//��ȡhibernate.cfg.xml
		Configuration config = new Configuration().configure();
		//��ȡsessionFactory����
		SessionFactory factory = config.buildSessionFactory();
		//��ȡsession
		Session session = factory.openSession();
		//��������
		Transaction beginTransaction = session.beginTransaction();
		
		
		//���idΪ4028818764d04c020164d04c08040000�Ķ���
		//��id,��session�й���     �־û�״̬ 
		User user = session.get(User.class, "1");
		User user1 = session.get(User.class, "1");
		User user2 = session.get(User.class, "1");
		User user3 = session.get(User.class, "1");
		User user4 = session.get(User.class, "1");
		//����Ĵ���
		System.out.println(user2 == user4);
		
		//���ö������Ϊlain
		//user.setUsername("lain");
		//�������ݿ�
		//session.update(user);
		
		
		
		//�ύ����
		beginTransaction.commit();
		//�ر�session
		session.close();
	}
	
	public void findUser()
	{
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		User user = openSession.get(User.class, "4028818764d04c020164d04c08040000");
		System.out.println(user.getName());
		beginTransaction.commit();
		openSession.close();
	}


	public User findUserById(String id) {
		
		Session session = HibernateUtils.getCurrentSesssion();
		return session.get(User.class, id);
	}


	public void ChangeUserByUserId(String id) {
		
		Session session =  HibernateUtils.getCurrentSesssion();
		//���õ��־û�user
		User user = session.get(User.class, id);
		//�ı�user (�־û�->beginTransaction.commit()���Ż�ͬ�������ݿ�)
		user.setUsername("trigger");
		
	}
	

}
