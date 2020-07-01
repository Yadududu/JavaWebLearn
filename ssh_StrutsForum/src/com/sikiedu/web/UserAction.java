package com.sikiedu.web;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sikiedu.domain.User;
import com.sikiedu.service.UserService;

public class UserAction extends ActionSupport  implements ModelDriven<User>{

	
	public User user = new User();
	//public String username;
	//public String password;
	
	public String login() throws Exception {
		
		System.out.println("login����");
		System.out.println(user.getUsername() + ":"+user.getPassword());
		

		System.out.println("session��::::::"+ ActionContext.getContext().getSession().get("mysession"));
		System.out.println("application��::::::"+ ActionContext.getContext().getApplication().get("myapplication"));
		
		
		UserService userService = new UserService();
		boolean success = userService.findUser(user);
		if(success)
		{
			ActionContext.getContext().getSession().put("user", user);
			return "success";			
		}
		else
		{
			ServletActionContext.getRequest().setAttribute("error", "�û������������!!!!!");
			return "error";
		}
	}
	
	public String register() throws Exception 
	{
		System.err.println("register����");
		return null;
	}

	public String kill() throws Exception 
	{
		System.err.println("kill����");
		return null;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}





	
	
	
}
