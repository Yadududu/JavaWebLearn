package com.sikiedu.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sikiedu.domain.User;
import com.sikiedu.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	public User user = new User();

	public String login() throws Exception {
		
		//��װUser

		//����UserService�е��ж��û��Ƿ���ڵķ���
		UserService userService = new UserService();
		boolean isSuccess = userService.findUser(user);
		//�õ�����ֵ
		if(isSuccess)
		{
			//�ɹ�   index.html ��session���з���user����
			ActionContext.getContext().getSession().put("user", user);
			return "getAllPaste";
		}
		else
		{
			//ʧ��   ��Ӵ�����Ϣ ת����login.jsp
			ActionContext.getContext().put("error", "�û��������������!!");
			return "login";
		}
						
	}

	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
	
	
}
