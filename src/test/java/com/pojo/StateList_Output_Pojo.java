package com.pojo;

import java.util.ArrayList;

public class StateList_Output_Pojo  {
	
	 private int status;
	    private String message;
	    private ArrayList<StateList_Input_Pojo> data;
		public int getStatus() {
			return status;
		}
		public String getMessage() {
			return message;
		}
		public ArrayList<StateList_Input_Pojo> getData() {
			return data;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public void setData(ArrayList<StateList_Input_Pojo> data) {
			this.data = data;
		}
	

}
