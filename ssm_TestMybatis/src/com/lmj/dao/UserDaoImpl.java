package com.lmj.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lmj.bean.User;

public class UserDaoImpl implements UserDao {

	SqlSessionFactory ssf;
	
	
	public UserDaoImpl(SqlSessionFactory ssf) {
		super();
		this.ssf = ssf;
	}

	@Override
	public User getUserById(Integer id) {
		
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		//����1��Ҫ������sql���   ����2 sql���Ĳ���
		return session.selectOne("UserMapper.selectUserById", 1);
	}

}
