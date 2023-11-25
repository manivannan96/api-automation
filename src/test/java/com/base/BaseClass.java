package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification reqspec;
	protected Response response;
	static WebDriver driver;

	public void addHeader(String key, String value) {
		reqspec = RestAssured.given().header(key, value);

	}

	public void addBody(String body) {
		reqspec = reqspec.body(body);

	}

	public void addQueryParam(String key, String value) {

		reqspec = reqspec.queryParam(key, value);

	}

	public Response requestType(String type, String endpoint) {

		switch (type) {
		case "GET":
			response = (reqspec.log().all().get(endpoint));

			break;
		case "POST":
			response = (reqspec.log().all().post(endpoint));
			break;

		case "PUT":
			response = (reqspec.log().all().put(endpoint));
			break;
		case "DELETE":
			response = (reqspec.log().all().delete(endpoint));
			break;

		default:
			break;
		}
		return response;

	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}

	public String resBodyAsString(Response response) {
		String asString = response.asString();
		return asString;
	}

	public String resBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;

	}

	public void basicAuth(String username, String password) {
		reqspec = reqspec.auth().preemptive().basic(username, password);
	}

	public void addHeaders(Headers headers) {
		reqspec = RestAssured.given().headers(headers);
	}

	public void addBody(Object body) {
		reqspec = reqspec.body(body);
	}

/*
	public static String getfile() {
		String path = System.getProperty("user.dir");
		return path;

	}
*/
	public static String getProjectPath() {
		return System.getProperty("user.dir");

	}
	
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

			Properties properties = new Properties();

			properties.load(new FileInputStream(getProjectPath()+ "\\Config\\config.properties"));
			System.out.println(properties);
			String value = (String) properties.get(key);
			return value;
		
		
	}
	
	public static void getDriver(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;

		}
	}
	
	
	

	}
