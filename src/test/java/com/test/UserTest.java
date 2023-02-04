package com.test;

import java.util.List;

import com.dao.UserDao;
import com.model.User;

public class UserTest {
	public static void main(String[] args)
	{
		//User user = new User();
//		user.setName("Selvammmm");
//		user.setEmail("mmmm@gmail.com");
//		user.setPassword("mmm@123");
//		user.setMobile("8884545323");	user.setUserId("78709");
//		UserDao.insert(user);
//		// Delete by id 
//		String id="78709";
//		UserDao.delete(id);
		
		// Get All User from userdataBase
		List<User> user=UserDao. getUserSql();
		for(User res:user)
		{
			System.out.println(res);
		}
		
		
	
		
		
	}
	

}
