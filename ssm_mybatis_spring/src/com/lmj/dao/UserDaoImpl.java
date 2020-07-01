package com.lmj.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lmj.bean.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserById(Integer id) {
		
		//����һ��sqlSession
		//SqlSession session = ssf.openSession();
		SqlSession session = getSqlSession();
		//�������ݿ�
		//����1��Ҫ������sql���   ����2 sql���Ĳ���
		return session.selectOne("UserMapper.selectUserById", 1);
	}

}
