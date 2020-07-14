package com.sikiedu.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sikiedu.dao.CriteriaDao;
import com.sikiedu.dao.HQLDao;
import com.sikiedu.dao.SQLDao;
import com.sikiedu.dao.UserDao;
import com.sikiedu.domain.User;
import com.sikiedu.utils.HibernateUtils;

public class UserService {

	public void test()
	{
		//HQLDao dao = new HQLDao();
		//dao.search2("1");
		//dao.search3("1");
		//dao.search4();
		//CriteriaDao dao = new CriteriaDao();
		//dao.search();
		SQLDao dao = new SQLDao();
		dao.fun3();
	}
	
	
	
	public void addUser(User user) {
		
		UserDao dao = new UserDao();
		//��ʼ����
		Session currentSesssion = HibernateUtils.getCurrentSesssion();
		Transaction beginTransaction = currentSesssion.beginTransaction();
		try
		{
			//���ݲ���tuser
			User tuser = dao.findUserById("1");
			if(tuser!=null)
			{
				//����ҵ���,����id�޸�����
				dao.ChangeUserByUserId(tuser.getId());
			}
			else
			{
				//û�ҵ�,�����κβ���
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			beginTransaction.rollback();
		}
			
		//�ύ����
		beginTransaction.commit();
		}

}
