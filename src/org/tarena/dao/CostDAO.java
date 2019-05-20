package org.tarena.dao;

import org.tarena.entity.Cost;

import antlr.collections.List;

public interface CostDAO {
	
	public Cost  findById(int id);
	
	public void save(Cost cost);
	
//	public List findAll();

}
