package com.shophub2.dao;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import com.shophub2.bean.User;


public class UserDao implements IUserDao{
	JdbcTemplate jdbcTemplate;
	String query;
	
	public UserDao() {
		super();
	}

	public UserDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public User get(String email) {
		Object[] inputs=new Object[]{email};
		query="select * from users where email=?";
		List<User> user=jdbcTemplate.query(query,inputs, new UserMapper());
		return user.get(0);
		
	}

	public List<User> getAll() {
		query="select * from users";
		List<User> users=jdbcTemplate.query(query, new UserMapper());
		return users;
	}

	public User add(User user) {
		query="insert into users(USERID,USERNAME,PASSWORD,EMAIL,CONTACT) values(uid_seq.nextval,'"+user.getUserName()+"','"+user.getPassword()+"','"+user.getEmail()+"','"+user.getContact()+"')";  
	    if(jdbcTemplate.update(query)==1)
	    	return user;
	    return null;
		
	}

	public boolean remove(long userId) {
		 query="delete from users where USERID='"+userId+"' ";    
		    if(jdbcTemplate.update(query)==1)
		    	return true;
		    return false;
	}

	public boolean update(User user) {
		
		Object[] inputs=new Object[]{user.getUserName(),user.getEmail(),user.getPassword(),user.getContact(),user.getUserId()};
		 String query="update users set username=?,email=?,password=?,contact=? where userid=?";  
		    return jdbcTemplate.update(query,inputs)==1?true:false;  
	}

	public boolean contains(long userId, String userName) {
		Object[] inputs=new Object[]{userId,userName};
		query="select * from users where userid=? and username=?";
		List<User> user=jdbcTemplate.query(query,inputs, new UserMapper());
		return user!=null?true:false;
		
	}
	
public static void main(String[] args) {
	//UserDao userDao=new UserDao();
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	UserDao jdbcModel=context.getBean(UserDao.class);
	/*jdbcModel.createTable();
	jdbcModel.insertRow();*/

	//System.out.println(jdbcModel.get(1));
	//User user=jdbcModel.add(new User("Roshan","112233","roshan@gmail.com",2323232));
	//System.out.println(jdbcModel.remove(61));
	//System.out.println(jdbcModel.get("birappa@gmail.com"));
	//System.out.println(jdbcModel.getAll());
	//System.out.println(jdbcModel.contains(1, "Birappa"));
	System.out.println(jdbcModel.update(new User(1,"birappa","birpatil@gmail.com",11111,"111222")));
}


}
