package org.tarena.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tarena.entity.Cost;


public class CostDAOImpl implements CostDAO {

	public Cost findById(int id) {
		Session session = HibernateUtil.openSession();
		Cost cost =  (Cost)session.get(Cost.class, id);
		return cost;
	}
	
	public void save(Cost cost) {
		Session session = HibernateUtil.openSession();
		Transaction txTransaction = session.beginTransaction();
		session.save(cost);
		txTransaction.commit();
		session.close();
	}
//
//	public List findAll() {
//		Session session = HibernateUtil.openSession();
//		String hqlString = "from Cost";
//		Query query = session.createQuery(hqlString);
//		List queryList = query.list();
//		session.close();
//		return queryList;
//	}
	
	
}
