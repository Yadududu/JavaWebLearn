package com.lmj.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lmj.dao.AccountDao;

@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, readOnly=true)
public class AccountServiceImpl implements AccountService {

	//�˻�dao
	private AccountDao ad;
	
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, readOnly=false)
	public void transferAccounts() {
		//ת���߼�
		
		//�ȴ�A�˻��ۿ�
		ad.subMoney(1,50d);
		int a = 1/0;
		
		//�ٴ�B�˻��ӿ�
		ad.addMoney(2,50d);
	}

}
