package org.junit;

import org.baseclasses.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends Baseclass {
	
	public BookingConfirmation() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
	public void BookingConfirmationlocators() {
		implicitwait(20);
		String getattribute = getattribute(getOrderno(), "value");
		System.out.println(getattribute);
		
		
	}

}
