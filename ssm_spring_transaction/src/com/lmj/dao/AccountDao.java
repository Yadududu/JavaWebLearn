package com.lmj.dao;

public interface AccountDao {

	//�ۿ�
	void subMoney(Integer id, double money);
	
	//�ӿ�
	void addMoney(Integer id, double money);

}
