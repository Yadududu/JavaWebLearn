package com.lmj.mapper;

import java.util.List;

import com.lmj.bean.User;
import com.lmj.bean.UserVo;

public interface UserMapper {
	//mapper��̬�������Ĵ�ԭ�� + һ��ע��
		//1���ӿڷ�������Ҫ��mapper.xml��Ҫ���õ�sql����idһ��
		//2���ӿڵ��β�������Ҫ��mapper.xml parameterType һ��
		//3���ӿڵķ���ֵ��Ҫ��mapper.xml resultTypeһ��
		//4��mapper.xml ��namespaceҪ��ӿڵ�ȫ����һ��
		//5��ע��mapper��̬�������У����ݷ���ֵ�������Զ�ѡ��
	
	//ͨ��id��ѯһ���û�
	public User selectUserById(Integer id);
	
	//ͨ���û���ģ����ѯ ��ȡ�û��б�
	public List<User> selectUserByName(String name);
	
	//ͨ��UserVo id��ѯһ���û�
	public User selectUserVobyId(UserVo vo);
	
	//��ѯ�û�������
	public Integer selectUserCount();
	
	//��ѯ�����û���װ��
	public List<UserVo> selectAllUserVo();
	
	//��������ѯͨ�������е�������ѯ�û��б�
	public List<User> selectUserListByUser(User u);
	
	//��������ѯ ͨ���û������е�������ѯ�û��б�Trim
	public List<User> selectUserListByUserTrim(User u);
	
	//�����û���
	public void updateSetUser(User u);
	
	//ʹ�ö��id��ȡ�û��б�by array
	public List<User> selectUserListByIds(Integer[] ids);
	
	//ʹ�ö��id��ȡ�û��б� by list
	public List<User> selectUserListByList(List<Integer> idList);
	
	//ʹ�ö��id��ȡ�û��б� by userVO
	public List<User> selectUserListByUserVo(UserVo vo);
}
