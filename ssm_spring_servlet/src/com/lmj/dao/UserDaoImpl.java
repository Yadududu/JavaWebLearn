package com.lmj.dao;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.lmj.bean.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class UserDaoImpl implements UserDao {

	private static ComboPooledDataSource dataSource;
	public static void setDataSource(ComboPooledDataSource dataSource) {
		UserDaoImpl.dataSource = dataSource;
	}
	
	
//	static {
//		//配置c3p0 //连接数据库 c3p0
//		try {
//			dataSource = new ComboPooledDataSource();
//			dataSource.setDriverClass("com.mysql.jdbc.Driver");
//			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssm_spring?useSSL=false");
//			dataSource.setUser("root");
//			dataSource.setPassword("root");
//		} catch (PropertyVetoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	

	@Override
	//通过数据库获取用户
	public User getUserByInfo(User u) {
		try {
			//使用dbutils操作数据库,查询并返回用户对象
			QueryRunner qr = new QueryRunner(dataSource);
			String sql = "select * from user where u_username = ? and u_password = ?";
			return qr.query(sql, new BeanHandler<User>(User.class),u.getU_username(),u.getU_password());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
