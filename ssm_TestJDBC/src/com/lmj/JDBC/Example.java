package com.lmj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example {
	public static void main(String[] args) {
		Example e = new Example();
//		e.addDate("�й�","�ݹ�");
//		e.delDate(10);
//		e.alterDate(11, "����", "ŦԼ");
		e.checkDate();
	}
	
	public void addDate(String countryname,String city) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtils.GetConnection();
			
			String sql = "insert into country(c_countryname,c_capital) value(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, countryname);
			ps.setString(2, city);
			int i = ps.executeUpdate();// ����ֵ�����յ�Ӱ�������
			if(i != 0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				JDBCUtils.Close(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void delDate(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtils.GetConnection();
			
			String sql = "delete from country where c_id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();// ����ֵ�����յ�Ӱ�������
			if(i != 0) {
				System.out.println("ɾ���ɹ�");
			}else {
				System.out.println("ɾ��ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				JDBCUtils.Close(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void alterDate(int id,String country,String city) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtils.GetConnection();
			
			String sql = "Update country set c_countryname = ?,c_capital = ? where c_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, country);
			ps.setString(2, city);
			ps.setInt(3, id);
			int i = ps.executeUpdate();// ����ֵ�����յ�Ӱ�������
			if(i != 0) {
				System.out.println("�޸ĳɹ�");
			}else {
				System.out.println("�޸�ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				JDBCUtils.Close(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void checkDate() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtils.GetConnection();
			
			String sql = "Select * from country";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("c_id")+","+rs.getString("c_countryname")+","+rs.getString("c_capital"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				JDBCUtils.Close(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
