package org.tarena.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sfFactory;
	
	static {
		Configuration conf = new Configuration();
		conf.configure("/hibernate.cfg.xml");
		
		sfFactory = conf.buildSessionFactory();
		
	}
	
	public static Session openSession() {
		
		Session session = sfFactory.openSession();
		
		return session;
		
	}

}
