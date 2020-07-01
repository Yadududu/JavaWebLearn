package com.sikiedu.web.intercept;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class UserIntercept extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		//��ȡsession
		Map<String, Object> session = ActionContext.getContext().getSession();
		//�ж�session�����Ƿ���user
		Object object = session.get("user");
		if(object == null)
		{
			//û��-->�ض���login.jsp
			return "toLogin";
		}
		else
		{
			//�����-->����
			return invocation.invoke();
		}
		
	}
	
	

}
