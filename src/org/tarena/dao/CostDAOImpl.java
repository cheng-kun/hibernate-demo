package org.tarena.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tarena.entity.Cost;

public class CostDAOImpl implements CostDAO {

	public Cost findById(int id) {
		
		Configuration conf = new Configuration();
		conf.configure("/hibernate.cfg.xml");
		
		SessionFactory sFactory = conf.buildSessionFactory();
		
		
		Session session = sFactory.openSession();
		
		Cost cost =  session.get(Cost.class, id);
		
		return cost;
	}

}
