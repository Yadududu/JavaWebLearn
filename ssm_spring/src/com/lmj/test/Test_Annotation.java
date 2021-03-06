package com.lmj.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmj.bean.User;
import com.lmj.bean.User2;

public class Test_Annotation {
	@Test
	public void Test1() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
	
		User2 u2 = (User2)ac.getBean("user");
		User2 u3 = (User2)ac.getBean("user");
		System.out.println(u2 == u3);
		
		ac.close();
	}
	
	@Test
	public void Test2() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
	
		User2 u2 = (User2)ac.getBean("user");
		System.out.println(u2);
	}
	
}
