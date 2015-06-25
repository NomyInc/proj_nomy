package com.nomy.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nomy.common.bo.PartyBo;


@Repository
@Qualifier("partyDao")

public class PartyDaoImpl extends DataAccessObject implements PartyDao, RowMapper<T> {

	private static final String FIND_PARTY =
			"SELECT * FROM PARTY";
	
	private static final String SAVE_PARTY =
			"INSERT INTO PARTY ( PARTY_ID, CREATE_DATE, UPDATE_DATE, LOV_PARTY_TYPE_CD) "
			+ " VALUES ( :id, createDate, updatedDate, partyTypeCd ) "; 
	
	@Override
	public void save(PartyBo party) {
		// TODO Auto-generated method stub
		//this.getJdbcTemplate().
	}

	@Override
	public PartyBo getById(int id) {
		this.getJdbcTemplate().query(FIND_PARTY, this);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PartyBo party) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PartyBo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
