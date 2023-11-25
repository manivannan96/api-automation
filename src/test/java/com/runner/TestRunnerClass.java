package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, tags = (""),
monochrome= true,
plugin = { "pretty",
"json:target\\Output.json" }, features = "src\\test\\resources\\Features",
glue = "com.stepdefinition")


public class TestRunnerClass extends BaseClass {
	//
	//	@AfterClass
	//
	//	public static void afterClass() throws FileNotFoundException, IOException {
	//		Reporting.generateJvmReport(getPropertyFileValue("json"));
	//
	//	}
}
