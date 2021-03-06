package com.lmj.dao;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lmj.bean.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
//	JdbcTemplate jt;
	
//	private static ComboPooledDataSource dataSource;
//	JdbcTemplate jt = new JdbcTemplate(dataSource);
//	
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
	
//	public void setJt(JdbcTemplate jt) {
//		this.jt = jt;
//	}

	//根据id查询一个用户
	@Override
	public User selectUserById(Integer id) {
		String sql = "select * from user where u_id =?";
		User user = getJdbcTemplate().queryForObject(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int index) throws SQLException {
				// TODO Auto-generated method stub
				User u = new User();
				u.setU_id(rs.getInt("u_id"));
				u.setU_username(rs.getString("u_username"));
				u.setU_password(rs.getString("u_password"));
				return u;
			}
			
		},id);
		return user;
	}
	
	//保存用户
	@Override
	public void saveUser(User u) {
		String sql = "insert into user values(null, ?, ?)";
		getJdbcTemplate().update(sql, u.getU_username(), u.getU_password());
	}

	//根据id删除用户
	@Override
	public void deleteUserById(Integer id) {
		String sql = "delete from user where u_id = ?";
		getJdbcTemplate().update(sql, id);
	}

	//更新用户
	@Override
	public void updateUser(User u) {
		String sql = "update user set u_username = ? , u_password = ? where u_id = ?";
		getJdbcTemplate().update(sql, u.getU_username(), u.getU_password(), u.getU_id());	
	}

	//查询用户列表
	@Override
	public List<User> selectAllUser() {
		String sql = "select * from user";
		List<User> list = getJdbcTemplate().query(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int index) throws SQLException {
				User u = new User();
				u.setU_id(rs.getInt("u_id"));
				u.setU_username(rs.getString("u_username"));
				u.setU_password(rs.getString("u_password"));
				return u;
			}
		});
		return list;
	}

	//查询用户数量
	@Override
	public Integer selectUserCount() {
		String sql = "select count(*) from user";
		return getJdbcTemplate().queryForObject(sql, Integer.class);
	}
}
