package org.sample;

import org.baseclasses.Baseclass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class AccessingAdactin extends Baseclass {
	
	@AfterClass
	private void afterclass() {
		launchbrowser();
		geturl("https://adactinhotelapp.com/index.php");
		maximizewindow();
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
