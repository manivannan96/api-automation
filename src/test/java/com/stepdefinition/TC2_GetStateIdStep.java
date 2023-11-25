package com.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.EndPoints;
import com.pojo.StateList_Input_Pojo;
import com.pojo.StateList_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_GetStateIdStep extends BaseClass{

	Response response;


	@Given("User and header for statelist page")
	public void user_and_header_for_statelist_page() {

		addHeader("accept", "application/json");

	}
	@When("User send {string} request for statelist endpoint")
	public void user_send_request_for_statelist_endpoint(String type) {

		Response response = requestType(type, EndPoints.STATELIST);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globaldatas.setStatuscode(statusCode);
	}

	@Then("User verify the statelist response body {string} is present and checkid")
	public void user_verify_the_statelist_response_body_is_present_and_checkid(String expstateName) {

		StateList_Output_Pojo stateList_Output_Pojo = response.as(StateList_Output_Pojo.class);
		ArrayList<StateList_Input_Pojo> data = stateList_Output_Pojo.getData();

		for (StateList_Input_Pojo eachstateList : data) {


			String stateName = eachstateList.getName();
			if (stateName.equals("Tamil Nadu")) {

				int stateIdNum = eachstateList.getId();
				String stateId = String.valueOf(stateIdNum);
				TC1_LoginStep.globaldatas.setStateId(stateId);

				TC1_LoginStep.globaldatas.setStateIdNum(stateIdNum);
				Assert.assertEquals("verify stateList", expstateName,"Tamil Nadu");


			}


		}
	}
}














