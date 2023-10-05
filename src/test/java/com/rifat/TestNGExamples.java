package com.rifat;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	
	@Test
	public void TestExamples() {
		System.out.println("Test...........");
	}
	
	@Test
	public void TestExamples2() {
		System.out.println("Test 2...........");
	}
	
	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("BeforeSuite..........");
	}
	
	@AfterSuite
	public void afterSuiteExample() {
		System.out.println("AfterSuite..........");
	}
	
	@BeforeTest
	public void beforeTestExample() {
		System.out.println("beforeTest..........");
	}
	
	@AfterTest
	public void afterTestExample() {
		System.out.println("afterTest..........");
	}
	
	@BeforeClass
	public void beforeClassExample() {
		System.out.println("beforeClass..........");
	}
	
	@AfterClass
	public void afterClassExample() {
		System.out.println("afterClass..........");
	}
	@BeforeMethod
	public void beforeMethodExamples() {
		System.out.println("beforeMethod...........");
	}
	
	@AfterMethod
	public void afterMethodExamples() {
		System.out.println("afterMethod...........");
	}

}
