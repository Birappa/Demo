package com.shophub2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shophub2.bean.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		
		User user=new User();
		user.setUserId(rs.getLong("USERID"));
		user.setUserName(rs.getString("USERNAME"));
		user.setEmail(rs.getString("EMAIL"));
		user.setContact(rs.getLong("CONTACT"));
		user.setPassword(rs.getString("PASSWORD"));
		return user;
	}

}
