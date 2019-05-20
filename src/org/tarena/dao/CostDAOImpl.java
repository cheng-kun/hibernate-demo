package org.tarena.dao;

import org.hibernate.Session;

import org.tarena.entity.Cost;

public class CostDAOImpl implements CostDAO {

	public Cost findById(int id) {
		
		Session session = HibernateUtil.openSession();
		
		Cost cost =  (Cost)session.get(Cost.class, id);
		
		return cost;
	}

}
