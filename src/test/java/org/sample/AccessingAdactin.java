package org.sample;

import org.baseclasses.Baseclass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class AccessingAdactin extends Baseclass {
	
	@BeforeClass
	private void beforeclass() {
		launchbrowser();
		geturl("https://adactinhotelapp.com/index.php");
		maximizewindow();
	}
	
	@Before
	private void before() {
		long starttime = System.currentTimeMillis();
	}
	@After
	private void after() {
		long starttime = System.currentTimeMillis();

	}
	@Test
	private void test() {
			}
	@Test
	private void test2() {
		// TODO Auto-generated method stub

	}
	@AfterClass
	private void AfterClass() {
		closeacurrentwindow();
}
}