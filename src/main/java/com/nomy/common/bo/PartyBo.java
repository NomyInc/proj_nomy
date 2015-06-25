package com.nomy.common.bo;

import org.joda.time.DateTime;

public class PartyBo  {

	private int id;
	private DateTime createDate;
	private DateTime updatedDate;
	private String partyTypeCd;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the createDate
	 */
	public DateTime getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updatedDate
	 */
	public DateTime getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(DateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the partyTypeCd
	 */
	public String getPartyTypeCd() {
		return partyTypeCd;
	}
	/**
	 * @param partyTypeCd the partyTypeCd to set
	 */
	public void setPartyTypeCd(String partyTypeCd) {
		this.partyTypeCd = partyTypeCd;
	} 
	
}
