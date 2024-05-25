package org.stepdefinition;

import org.base.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LibGlobal {

	@Before(order = 2)
	private void PreCondition1() {
		
		maximize();

	}
	@Before(order = 1)
	private void PreCondition2() {
		launchBrowser();
		
	}
	@Before(order = 3 , value = "@sanity")
	private void PreCondition3() {
		System.out.println("precondition 3");
	}
	

	@After(order = 2)

	private void PostCondition1() {
		System.out.println("screenshort");
	}
	@After(order = 1)

	private void PostCondition2() {
		quit();
	}


}
