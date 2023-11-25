package com.pojo;

import java.util.ArrayList;

public class CityList_Output_Pojo {
	
	private int status;
    private String message;
    private ArrayList<cityList> data;
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public ArrayList<cityList> getData() {
		return data;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setData(ArrayList<cityList> data) {
		this.data = data;
	}



}
