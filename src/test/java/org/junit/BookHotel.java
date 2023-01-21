package org.junit;

import java.awt.print.PageFormat;

import org.baseclasses.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class BookHotel extends Baseclass {
	
	public BookHotel() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname ;
	@FindBy(id="last_name")
	private WebElement lastname ;
	@FindBy(id="address")
	private WebElement address ;
	@FindBy(id="cc_num")
	private WebElement cardno ;
	@FindBy(id="cc_type")
	private WebElement ddcardtype ;
	@FindBy(id="cc_exp_month")
	private WebElement ddexpmonth ;
	@FindBy(id="cc_exp_year")
	private WebElement ddexpyear ;
	@FindBy(id="cc_cvv")
	private WebElement cvv ;
	@FindBy(id="book_now")
	private WebElement btnbooknow ;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getDdcardtype() {
		return ddcardtype;
	}
	public WebElement getDdexpmonth() {
		return ddexpmonth;
	}
	public WebElement getDdexpyear() {
		return ddexpyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBtnbooknow() {
		return btnbooknow;
	} 
	public void BookHotellocators(String firstname,String lastname,String address,String cardno,String cardtype,String expmon,String expyr,String cvv) {
		sendkeys(getFirstname(),firstname);
		sendkeys(getLastname(), lastname);
		sendkeys(getAddress(), address);
		sendkeys(getCardno(), cardno);
		sendkeys(getDdcardtype(), cardtype);
		sendkeys(getDdexpmonth(), expmon);
		sendkeys(getDdexpyear(), expyr);
		sendkeys(getCvv(), cvv);
		click(getBtnbooknow());
	}
}
