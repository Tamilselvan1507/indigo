package org.sample;

import java.io.IOException;

import org.baseclasses.Baseclass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.BookHotel;
import org.junit.BookingConfirmation;
import org.junit.LoginPage;
import org.junit.SearchHotel;
import org.junit.SelectHotel;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class accessingpom extends Baseclass{
	
	@BeforeClass
	public static void beforeclass() {
		launchbrowser();
		maximizewindow();
		geturl("https://adactinhotelapp.com/index.php");
	}
	@AfterClass
	public static void afterclass() {
		closeacurrentwindow();
	}
	
	@Test
	public void test6() {
		LoginPage lp = new LoginPage();
		lp.loginpagelocators("TamilSiva5674", "Tamil@5674");
		SearchHotel sh = new SearchHotel();
		sh.SearchHotellocators("london", "Hotel Creek", "single", "1", "17/01/2023", "18/01/2023", "0");
		SelectHotel SelectHotel = new SelectHotel();
		SelectHotel.SelectHotellocators();
		BookHotel bh = new BookHotel();
		bh.BookHotellocators("tamil", "selvan", "namakkal,tamilnadu", "8523697412587410", "visa", "june", "2023", "377");
		BookingConfirmation bc = new BookingConfirmation();
		bc.BookingConfirmationlocators();
	}
//	@Test
//	public void test1() throws IOException {
//		LoginPage lp = new LoginPage();
//	WebElement txtusername = lp.getTxtusername();
//	String username = getDataFromCell("Sheet1", 12, 0);
//	sendkeys(txtusername, username);
//	WebElement txtpassword = lp.getTxtpassword();
//	String password = getDataFromCell("Sheet1", 12, 1);
//	sendkeys(txtpassword, password);
//	WebElement btnlogin = lp.getBtnlogin();
//	click(btnlogin);	
//	}
//	
//	@Test
//	public void test2() throws IOException {
//		implicitwait(10);
//		SearchHotel sh = new SearchHotel();
//	WebElement ddlocation = sh.getDdlocation();
//	String location = getDataFromCell("Sheet1", 6, 0);
//	sendkeys(ddlocation, location);
//	WebElement ddhotel = sh.getDdhotel();
//	String hotel = getDataFromCell("Sheet1", 9, 1);
//	sendkeys(ddhotel, hotel);
//	WebElement ddroomtype = sh.getDdroomtype();
//	String roomtype = getDataFromCell("Sheet1", 9, 2);
//	sendkeys(ddroomtype, roomtype);
//	WebElement ddroomnos = sh.getDdroomnos();
//	String roomnos = getDataFromCell("Sheet1", 9 , 3);
//	sendkeys(ddroomnos, roomnos);
//	WebElement pickindate = sh.getPickindate();
//	String pickin = getDataFromCell("Sheet1", 9, 6);
//	cleartextbox(pickindate);
//	sendkeys(pickindate, pickin);
//	WebElement pickoutdate = sh.getPickoutdate();
//	String pickout = getDataFromCell("Sheet1", 9, 7);
//	cleartextbox(pickoutdate);
//	sendkeys(pickoutdate, pickout);
//	WebElement ddadultroom = sh.getDdadultroom();
//	String adultroom = getDataFromCell("Sheet1", 9, 4);
//	sendkeys(ddadultroom, adultroom);
//	WebElement ddchildroom = sh.getDdchildroom();
//	String childroom = getDataFromCell("Sheet1", 9, 5);
//	sendkeys(ddchildroom, childroom);
//	WebElement btnlogin = sh.getBtnlogin();
//	click(btnlogin);
//	}
//	
//	@Test
//	public void test3() {
//		implicitwait(10);
//		SelectHotel hs = new SelectHotel();
//	WebElement radiobtn = hs.getRadiobtn();
//	click(radiobtn);
//	WebElement btncontinue = hs.getBtncontinue();
//	click(btncontinue);
//	}
//	
//	@Test
//	public void test4() throws IOException {
//		implicitwait(10);
//		BookHotel bh = new BookHotel();
//	WebElement firstname = bh.getFirstname();
//	String fname = getDataFromCell("Sheet1", 14, 2);
//	sendkeys(firstname, fname);
//	WebElement lastname = bh.getLastname();
//	String lname = getDataFromCell("Sheet1", 14, 3);
//	sendkeys(lastname, lname);
//	WebElement address = bh.getAddress();
//	String add = getDataFromCell("Sheet1", 14, 4);
//	sendkeys(address, add);
//	WebElement cardno = bh.getCardno();
//	String cardnum = getDataFromCell("Sheet1", 14, 5);
//	sendkeys(cardno, cardnum);
//	WebElement ddcardtype = bh.getDdcardtype();
//	String cardtype = getDataFromCell("Sheet1", 14, 6);
//	sendkeys(ddcardtype, cardtype);
//	WebElement ddexpmonth = bh.getDdexpmonth();
//	String expmonth = getDataFromCell("Sheet1", 14, 7);
//	sendkeys(ddexpmonth, expmonth);
//	WebElement ddexpyear = bh.getDdexpyear();
//	String expyear = getDataFromCell("Sheet1", 14, 8);
//	sendkeys(ddexpyear, expyear);
//	WebElement cvv = bh.getCvv();
//	String cvvno = getDataFromCell("Sheet1", 14, 9);
//	sendkeys(cvv, cvvno);
//	WebElement btnbooknow = bh.getBtnbooknow();
//	click(btnbooknow);	
//	}
//	
//	@Test
//	public void test5() throws IOException {
//		implicitwait(20);
//		BookingConfirmation bc = new BookingConfirmation();
//	WebElement orderno = bc.getOrderno();
//	String getattribute = getattribute(orderno, "value");		
//	System.out.println(getattribute);
////	String oldData = getDataFromCell("Sheet1", 15, 1);
////	updateCell("Sheet1", 15, 1, oldData, getattribute);
//	writeCellData("Sheet1", 15, 1, getattribute);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
