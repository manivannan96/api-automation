package com.globals;

import com.base.BaseClass;

public class GlobalDatas extends BaseClass {

	private int statuscode;
	private String logtoken;
	private String address_id;
	private int stateIdNum;
	private String stateId;
	private int cityId;
	public int getStatuscode() {
		return statuscode;
	}
	public String getLogtoken() {
		return logtoken;
	}
	public String getAddress_id() {
		return address_id;
	}
	public int getStateIdNum() {
		return stateIdNum;
	}
	public String getStateId() {
		return stateId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public void setLogtoken(String logtoken) {
		this.logtoken = logtoken;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public void setStateIdNum(int state_id) {
		this.stateIdNum = state_id;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
	
	
}
