package org.sample;

import org.baseclasses.Baseclass;
import org.testng.annotations.AfterClass;

public class AccessingAdactin extends Baseclass {
	
	@AfterClass
	private void afterclass() {
		launchbrowser();
		geturl("https://adactinhotelapp.com/index.php");
		maximizewindow();
	}

}
