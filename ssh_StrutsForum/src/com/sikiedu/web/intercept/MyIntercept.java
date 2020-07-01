package com.sikiedu.web.intercept;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

//��һ�ִ����������ķ�ʽ
public class MyIntercept extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("MyIntercept");
		
		//��ȡsession
		Map<String, Object> session = ActionContext.getContext().getSession();
		//��ȡsession�е�user
		Object object = session.get("user");
		//�ж�sessoin���Ƿ���user����
		if(object!=null)
		{
			//��,����
			return invocation.invoke();
		}
		else
		{
			//û��,�ض���login.jsp
			return "toLogin";
		}
		
	}

}
