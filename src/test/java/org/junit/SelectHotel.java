package org.junit;

import org.baseclasses.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Baseclass{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public void SelectHotellocators() {
		click(getRadiobtn());
		click(getBtncontinue());		}
	

}
