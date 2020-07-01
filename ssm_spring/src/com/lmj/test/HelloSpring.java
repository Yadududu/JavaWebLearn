package com.lmj.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmj.bean.User;

public class HelloSpring {
	
	//��֮ǰ��Ŀ���� new �����������Լ�����
	@Test
	public void Test1() {
		User u = new User();
		u.setU_id(1);
		System.out.println(u);
	}
	
	//IOC�ķ�ת������������ݹ����������Լ�ִ�з�ת��spring������ִ�У�
	//IOC�Ŀ��ƣ�������spring�����Ǹ��𴴽����ٶ����ƿض�����������ڵȣ���������Ҫʹ�ö����ʱ���Spring���뼴�ɣ�
	//IOC��һ�ֱ��˼�룬Ҳ��һ���µ����ģʽ������ҪDI������ע�룩������֧�֣�
	
	//spring��һ�����������������ǹ������
	@Test
	public void Test2() {
		//����spring�����ļ���ȡ��������
		//ApplicationContext ���õ�����bean����������������ʱ�򱻴�������
		//������õ�bean�϶࣬��ô�ڴ���������ʱ�򣬻�����ڴ��������⣻��������ڻ���Ӳ�����ܽ�Ϊ����ʱ�����ֵıȽ����ԣ�
		//�ӳټ��� lazy-init="true"���Ǵ�������ʱ���������õ�bean�����ڻ�ȡ��ʱ��Ŵ�����
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//User u = (User) ac.getBean("user");
		//ͨ��getBean��ȡ���úõ�user���󣨳���Ա��spring����Ҫ����
		User u = ac.getBean(User.class);
		System.out.println(u);
	}
	
	@Test
	public void Test3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//scope="singleton" Ĭ��ֵ ������ ֻ����һ������ һ����Ŀ�в���singleton
		User u1 = ac.getBean(User.class);
		User u2 = ac.getBean(User.class);
		User u3 = ac.getBean(User.class);
		
		System.out.println(u1 == u2);
		
	}
	
	@Test
	public void Test4() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// scope="prototype" ������ �ڻ�ȡ��ʱ��ᴴ���µĶ��� �������⻷������Ҫ��Ϊprototype
		User u1 = ac.getBean(User.class);
		User u2 = ac.getBean(User.class);
		User u3 = ac.getBean(User.class);
	
		System.out.println(u1 == u2);
		
		//�ر��������󣬾ͻᴥ��bean��destroymethod
		ac.close();
	}
}
