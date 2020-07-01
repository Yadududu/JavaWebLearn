package com.lmj.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lmj.bean.User;
import com.lmj.bean.UserExample;
import com.lmj.mapper.UserMapper;

public class MapperTest {
	@Test
	public void text1() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		//��ס����ѯ
		User user = mapper.selectByPrimaryKey(1);
		System.out.println(user);
	
	}
	@Test
	public void text2() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		
		UserExample example = new UserExample();
		//��������װ��createCriteria������
		example.createCriteria().andUSexEqualTo("1").andUUsernameLike("%��%");
		//��������ѯ
		List<User> list=mapper.selectByExample(example);
		for(User user:list) {
			System.out.println(user);
		}
	}
	
	@Test
	public void text3() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
		
		//����һ��sqlSession
		SqlSession session = ssf.openSession();
		//�������ݿ�
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		User user = new User();
		user.setuUsername("����");
		mapper.insertSelective(user);
		session.commit();
	
	}
}

