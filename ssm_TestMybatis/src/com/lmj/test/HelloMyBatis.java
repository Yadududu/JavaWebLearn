package com.lmj.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lmj.bean.User;

public class HelloMyBatis {
	@Test
	//���ų��� ͨ��ID ��ѯ�û�
	public void text1() throws IOException {
		String resource = "sqlMapConfig.xml";
		
		//��ȡ�����ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//��ҪsqlSessionFactoryBulider
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//����sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		//����1��Ҫ������sql���   ����2 sql���Ĳ���
		User user = session.selectOne("UserMapper.selectUserById", 1);
		System.out.println(user);
	}
	@Test
	//���ų��� ģ����ѯ  ��ѯ�û�
	public void text2() throws IOException {
		String resource = "sqlMapConfig.xml";
		
		//��ȡ�����ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//��ҪsqlSessionFactoryBulider
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//����sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		//����1��Ҫ������sql���   ����2 sql���Ĳ���
		List<User> list = session.selectList("UserMapper.selectUserByName","��");
		for(User user:list) {
			System.out.println(user);
		}
	}
	@Test
	//���ų���	����û�
	public void text3() throws IOException {
		String resource = "sqlMapConfig.xml";
		
		//��ȡ�����ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//��ҪsqlSessionFactoryBulider
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//����sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		User u = new User();
		u.setU_username("С��");
		u.setU_password("123");
		u.setU_sex("1");
		u.setU_createTime(new Date());
		u.setU_cid(1);
		
		session.insert("UserMapper.insertUser",u);
		session.commit();
	}
	@Test
	//���ų���	�޸��û�
	public void text4() throws IOException {
		String resource = "sqlMapConfig.xml";
		
		//��ȡ�����ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//��ҪsqlSessionFactoryBulider
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//����sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		User u = new User();
		u.setU_id(14);
		u.setU_username("С��");
		
		session.update("UserMapper.updateUser",u);
		session.commit();
	}
	@Test
	//���ų���	ɾ���û�
	public void text5() throws IOException {
		String resource = "sqlMapConfig.xml";
		
		//��ȡ�����ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//��ҪsqlSessionFactoryBulider
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//����sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		session.delete("UserMapper.deleteUserById",16);
		session.commit();
	}
}
