package com.lmj.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmj.bean.Pet;


@RunWith(SpringJUnit4ClassRunner.class)//ʹ��junit���в��ԣ������Ǵ�������
@ContextConfiguration("classpath:applicationContext.xml") //��ȡ�����ļ�
public class test_JUnit {
	
	@Resource(name="dog")
	private Pet p;
	
	@Test
	public void Test1() {
		System.out.println(p);
	}
}
