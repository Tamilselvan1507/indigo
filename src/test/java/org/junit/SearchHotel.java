package org.junit;


import org.baseclasses.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddlocation;
	@FindBy(id="hotels")
	private WebElement ddhotel;
	@FindBy(id="room_type")
	private WebElement ddroomtype;
	@FindBy(id="room_nos")
	private WebElement ddroomnos;
	@FindBy(id="datepick_in")
	private WebElement pickindate;
	@FindBy(id="datepick_out")
	private WebElement pickoutdate;
	@FindBy(id="adult_room")
	private WebElement ddadultroom;
	@FindBy(id="child_room")
	private WebElement ddchildroom;
	@FindBy(id="Submit")
	private WebElement btnlogin;
	
	public WebElement getDdlocation() {
		return ddlocation;
	}
	public WebElement getDdhotel() {
		return ddhotel;
	}
	public WebElement getDdroomtype() {
		return ddroomtype;
	}
	public WebElement getDdroomnos() {
		return ddroomnos;
	}
	public WebElement getPickindate() {
		return pickindate;
	}
	public WebElement getPickoutdate() {
		return pickoutdate;
	}
	public WebElement getDdadultroom() {
		return ddadultroom;
	}
	public WebElement getDdchildroom() {
		return ddchildroom;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void SearchHotellocators(String location,String hotel,String roomtype,String roomnos,String pickindate,String pickoutdate,String adultroom) {
		sendkeys(getDdlocation(), location);		
		sendkeys(getDdhotel(), hotel);		
		sendkeys(getDdroomtype(), roomtype);		
		sendkeys(getDdroomnos(), roomnos);	
		cleartextbox(getPickindate());
		sendkeys(getPickindate(), pickindate);	
		cleartextbox(getPickoutdate());
		sendkeys(getPickoutdate(), pickoutdate);		
		sendkeys(getDdadultroom(), adultroom);		
		click(getBtnlogin());	
		}
	
}
