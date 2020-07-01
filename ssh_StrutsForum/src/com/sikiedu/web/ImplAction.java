package com.sikiedu.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ImplAction implements Action {

	@Override
	public String execute() throws Exception {
		System.err.println("����ʵ����Action�ӿڵ�action");
		return "defaultAction";
	}
	
	
	public String login() throws Exception 
	{
		//�õ�ԭ����request��
		//ServletActionContext.getRequest().setAttribute("username", "123");
		//ServletActionContext.getRequest().setAttribute("password", "123");
		
		//request��setAttr
		ActionContext.getContext().put("username", "123");
		ActionContext.getContext().put("password", "123");
		
		//���session
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("mysession", "����session��");
		//���Application
		Map<String, Object> application = ActionContext.getContext().getApplication();
		application.put("myapplication", "����application��");
		
		//���ԭ����request
		HttpServletRequest request = ServletActionContext.getRequest();
		
		//���ԭ����response
		HttpServletResponse response = ServletActionContext.getResponse();
		
		return "toLogin";
	}
	

}
