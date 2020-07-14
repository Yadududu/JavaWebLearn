package com.sikiedu.jdbc01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCPDataSource {
	private static final String connectionURL="jdbc:mysql://localhost:3306/web01?useUnicode=true&characterEncoding=UTF8&useSSL=false" ;
	private static final String username = "root";
	private static final String password = "root";
	
	private static BasicDataSource ds;
	
	static {
		//��ʼ��dbcp����Դ
		ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(connectionURL);
		ds.setUsername(username);
		ds.setPassword(password);
		
		ds.setInitialSize(5);
		ds.setMaxTotal(20);
		ds.setMinIdle(3);
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();//ͨ��dbcp�õ������ӣ�����Ҫ�黹��ֱ��close�Ϳ���,
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void close(ResultSet rs,Statement stmt,Connection con) {
		closeResultSet(rs);
		closeStatement(stmt);
		closeConnection(con);
	}
	public static void close(Statement stmt1,Statement stmt2,Connection con) {
		closeStatement(stmt1);
		closeStatement(stmt2);
		closeConnection(con);
	}
	
	
	private static void closeResultSet(ResultSet rs ) {
		try {
			if(rs!=null)rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void closeStatement(Statement stmt) {
		try {
			if(stmt!=null)
				stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void closeConnection(Connection con) {
		try {
			if(con!=null)con.close();//���������ӹ黹��dbcp���ӳأ������������ĶϿ�����
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
