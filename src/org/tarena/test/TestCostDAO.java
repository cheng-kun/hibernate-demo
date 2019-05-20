package org.tarena.test;

import org.junit.Test;
import org.tarena.dao.CostDAO;
import org.tarena.dao.CostDAOImpl;
import org.tarena.entity.Cost;

public class TestCostDAO {
	
	@Test
	public void test1() {
		CostDAO costDAO = new CostDAOImpl();
		
		Cost cost = costDAO.findById(1);
		
		System.out.println(cost);
	}

}
