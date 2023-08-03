package com.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	@Before
	public void beforelaunch()
	{
		System.out.println("start");
	}
	@After
	public void beforelaunch1()
	{
		System.out.println("end");
	}
	
}
