package com.test;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Alien;

import com.model.Labtop;

public class App {

	public static void main(String[] args) {
		
//		Alien obj = new Alien();
//		obj.setAid(1);
//		obj.setAname("selva");
//		
//	
//		obj.setColor("black");
//		
//		Labtop laptop = new Labtop();
//		laptop.setId(1);
//		laptop.setName("ASUS");
//		laptop.getAlien().add(obj);
//		obj.getLap().add(laptop);
//		
//		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("addUser");
		EntityManager ft = factory.createEntityManager();
		Session session= ft.unwrap(org.hibernate.Session.class);
		SessionFactory st =session.getSessionFactory();
		Transaction tx  = session.getTransaction();
		tx.begin();	
		
		
//		for(int i=2;i<=50;i++)
//		{
//			Alien obj = new Alien();
//			obj.setAid(i);
//			obj.setAname("name1"+i);
//			
//		
//			obj.setColor("black"+i);
//			Labtop laptop = new Labtop();
//			laptop.setId(i+2);
//			laptop.setName("ASUS"+i);
//			obj.getLap().add(laptop);
//			laptop.setAlien(obj);
//			session.save(obj);
//			session.save(laptop);
//		}
//		
		
//		
//		session.save(obj);
//		session.save(laptop);
		
//		Query<Alien> user1= session.createNativeQuery("select u. * from Alien u where u.aid =?",Alien.class);
//		user1.setParameter(1, 3);
//		Alien user=user1.getSingleResult();
//		System.out.println(user);
	
		
	Query<Alien> user1  =session.createNativeQuery("select u. * from Alien u ",Alien.class);
	Collection<Alien> user =user1.getResultList();
	for(Alien i: user)
	{
		System.out.println(i.getAid());
	}
	Query<Alien> user2  =session.createNativeQuery("select u. * from Alien u ",Alien.class);
	Collection<Alien> user5 =user2.getResultList();
	for(Alien i: user5)
	{
		System.out.println(i.getAid()+" "+ i.getLap());
	}
	

	
			
		
		
//		
		
	
		
	
	
//		//Query<Alien> user = session.createQuery("select u from com.model.Alien u where u.aid =?1",Alien.class);
//		Query<Alien> user = session.createNativeQuery("select u. * from Alien u where u.aid=?",Alien.class);
//		
//		user.setParameter(1,2);
//	 List<Alien> obj1=user.getResultList();
		tx.commit();
//	for(Alien a : obj1)
//	{
//		System.out.println(a);
//	}
		session.close();
		
//		
//		String value ="sel";
//		Query<Alien> user1  =session.createQuery("select u from com.model.Alien u where u.aname like ?1",Alien.class);
//		user1.setParameter(1, value+"%");

	}  

}
