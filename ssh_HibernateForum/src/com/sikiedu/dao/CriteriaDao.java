package com.sikiedu.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.sikiedu.domain.User;
import com.sikiedu.utils.HibernateUtils;

public class CriteriaDao {

	// ������ѯ
	public void search() {

		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		/////////////////////
		// ���� select * from user

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		// createQuery-->��ѯ����(����Ҫ֪����ѯʲô��������)
		CriteriaQuery<User> createQuery = criteriaBuilder.createQuery(User.class);
		Root<User> from = createQuery.from(User.class);
		createQuery.select(from);
		
		
		// ִ�в�ѯ
		List<User> resultList = session.createQuery(createQuery).getResultList();

		System.out.println(resultList);

		/////////////////////
		beginTransaction.commit();
		session.close();

	}

	// ������ѯ
	public void search2() {

		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		/////////////////////
		// ���� select * from user

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		// createQuery-->��ѯ����(����Ҫ֪����ѯʲô��������)
		CriteriaQuery<User> criteria = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root).where(root.get("id").in("1"));
		// ִ�в�ѯ
		List<User> resultList = session.createQuery(criteria).getResultList();

		System.out.println(resultList);

		/////////////////////
		beginTransaction.commit();
		session.close();

	}

	// ��ѯ������ѯ
	public void search3() {

		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		/////////////////////
		// ���� select count(*) from user

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		// createQuery-->��ѯ����(����Ҫ֪����ѯʲô��������)(��Integer Long)
		CriteriaQuery<Long> criteria = criteriaBuilder.createQuery(Long.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(criteriaBuilder.count(root));
		
		// ִ�в�ѯ
		Long count = session.createQuery(criteria).uniqueResult();
		
		System.out.println(count);

		/////////////////////
		beginTransaction.commit();
		session.close();

	}
	
	//��ѯ���ִ���i���˵����� -- 2
	// ��ѯ������ѯ
	public void search4() {

		Session session = HibernateUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		/////////////////////
		// ���� select count(*) from user where username like '%i%'  
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		CriteriaQuery<Long> criteria = criteriaBuilder.createQuery(Long.class);
		Root<User> root = criteria.from(User.class);
		
		criteria.select(criteriaBuilder.count(root)).where(criteriaBuilder.like(root.get("username"), "%i%"));

	
		Long count = session.createQuery(criteria).uniqueResult();

		System.out.println(count);
		
		/////////////////////
		beginTransaction.commit();
		session.close();

	}
	

}
