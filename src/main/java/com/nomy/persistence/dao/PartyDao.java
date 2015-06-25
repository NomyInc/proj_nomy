package com.nomy.persistence.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nomy.common.bo.PartyBo;


public interface PartyDao {

	//Create 
	public void save(PartyBo party);
	
	//Read
	public PartyBo getById(int id);
	
	//Update
	public void update(PartyBo party);
	
	//Delete
	public void deleteById(int id);
	
	//Every Object
	public List<PartyBo> getAll();
	

}
