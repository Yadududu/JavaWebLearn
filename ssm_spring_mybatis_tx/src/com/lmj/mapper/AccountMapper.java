package com.lmj.mapper;

import com.lmj.bean.Account;

/**
 * �˻�mapper�ӿ�
 * 
 * */
public interface AccountMapper {
	//�������ݿ�ۿ�ͼӿ�
	
	//�ۿ�
	void subMoney(Account pay);
	
	//�ӿ�
	void addMoney(Account collect);
}
