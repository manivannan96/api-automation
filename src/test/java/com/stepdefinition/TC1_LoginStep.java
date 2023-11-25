package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.EndPoints;
import com.globals.GlobalDatas;
import com.pojo.Login_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class TC1_LoginStep extends BaseClass{
	
	Response response;
	static GlobalDatas globaldatas=	new GlobalDatas();

		@Given("User and header for login page")
	public void user_and_header_for_login_page() {
		
			addHeader("accept", "application/json");

			
			
			
	}
	@When("User and basic authentication for login")
	public void user_and_basic_authentication_for_login() throws FileNotFoundException, IOException {
	  
		
		basicAuth(getPropertyFileValue("username"), getPropertyFileValue("password"));
	

		
	}
	@When("User send {string} request for login endpoint")
	public void user_send_request_for_login_endpoint(String type) {
	   
		response = requestType(type, EndPoints.POSTMANBASICAUTHLOGIN);
		int statusCode = getStatusCode(response);
		TC1_LoginStep.globaldatas.setStatuscode(statusCode);
		
		
		
	}
	
	@Then("User verify the login response body firstName present as {string} and get the logtoken")
	public void user_verify_the_login_response_body_first_name_present_as_and_get_the_logtoken(String expfirstName) {
	   
	
	Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
	String actfirst_name = login_Output_Pojo.getData().getFirst_name();
	Assert.assertEquals("verify first name", expfirstName,actfirst_name);
	String logtoken = login_Output_Pojo.getData().getLogtoken();
	TC1_LoginStep.globaldatas.setLogtoken(logtoken);
	}












	
	
}
