package com.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Util.Hibernate;
import com.model.User;

public class UserDao {
public static void insert(User user)
{
	Session session=Hibernate.getSession();
	
	Transaction tx=session.getTransaction();
	tx.begin();
	try {
		session.persist(user);
		tx.commit();
	}
	catch(Exception e) {
		tx.rollback();
	}
	finally
	{
		session.close();
	}
}
public static void delete(String id)
{
	Session session = Hibernate.getSession();
	Transaction tx= session.getTransaction();
	tx.begin();
	try {
		User user=session.find(User.class, id);
		session.remove(user);
		tx.commit();
	}
	catch(Exception e)
	{
		tx.rollback();
	}
	finally
	{
		session.close();
	}
	
}
public static List<User> getUser()
{
	Session session= Hibernate.getSession();
	Query<User> user=session.createQuery("Select u from com.model.User u",User.class);
	return user.getResultList();
	
}
public static List<User> getUserSql()
{
	Session session= Hibernate.getSession();
	Query<User> user=session.createNativeQuery("Select u.* from library_User_Details u",User.class);
	return user.getResultList();
	
}

}
