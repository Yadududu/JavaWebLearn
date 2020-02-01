package com.lmj.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//<bean name="user" class="com.lmj.bean.User">
@Component("user")

//@Controller()		//对应web层
//@Service("user")	//对应service
//@Repository()		//对应dao层
//@Scope(scopeName="prototype")
public class User2 {
	
	@Value(value="1")	//使用暴力反射去注入的
	private Integer u_id;	
	private String u_username;
	private String u_password;
	
	//加入宠物字段
	private Pet u_pet;
	
	public Pet getU_pet() {
		return u_pet;
	}

	//自动装配
//	@Autowired
	//手动指定
	@Resource(name="dog")
	public void setU_pet(Pet u_pet) {
		this.u_pet = u_pet;
	}

	public User2() {
		System.out.println("User2 对象空参构造方法");
	}
	
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_username() {
		return u_username;
	}
	
	@Value("老王")	//推荐在set方法上注入
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	
	//在构造方法后调用
	@PostConstruct()
	public void userInit() {
		System.out.println("user init ");
	}
		
	//在销毁方法前调用
	@PreDestroy()
	public void userDestroy() {
		System.out.println("user destroy");
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_pet=" + u_pet
				+ "]";
	}
	

	
}
