package org.baseclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends Baseexcel {
	public static WebDriver driver;
	
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void maximizewindow() {
		driver.manage().window().maximize();
	}
	public static void sendkeys(WebElement element , String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void acceptalert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void cancelalert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public String gettext() {
		String title = driver.getTitle();
		return title;
	}
	public String getattribute(WebElement element , String data) {
		String attribute = element.getAttribute(data);
		return attribute;
	}
	public static void closeallwindow() {
		driver.quit();
	}
	public static void closeacurrentwindow() {
		driver.close();
	}
//	public String gettittlewebpage() {
//		String title = driver.getTitle();
//		return title;
//	}
	public String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void ddselectbyvisibletext(WebElement element , String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}
	public static void ddbyattributevalue(WebElement element , String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}
	public static void ddselectbyindex(WebElement element , int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public static void insertvalueusingjs(WebElement element , String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute'value"+data+"')", element);
	}
	public static void clickbyjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void switctochildwindow(String childwindowid) {
		driver.switchTo().window(childwindowid);
	}
	public static void swithframebyindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void swithframebyid(String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	public WebElement findlocatorbyid(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}
	public WebElement findlocatorbyname(String attributevalue) {
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}
	public WebElement findlocatorbyclassname(String attributevalue) {
		WebElement findElement = driver.findElement(By.className(attributevalue));
		return findElement;
	}
	public WebElement findlocatorbyxpath(String attributevalue) {
		WebElement findElement = driver.findElement(By.xpath(attributevalue));
		return findElement;
	}
	public List<WebElement> ddalloptiontext(WebElement element) {
		Select s = new Select(element);
		//String text1 = element.getText();
		//s.selectByVisibleText(text1);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		return options;
	}
	public List<WebElement> ddalloptioninattribute(WebElement element , String value) {
		Select s = new Select(element);
		//String attribute = element.getAttribute(value);
		//s.selectByValue(attribute);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getAttribute(value);
			System.out.println(text);
		}
		return options;
		
	}
	public WebElement ddfirstselectoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		//String text = firstSelectedOption.getText();
		//System.out.println(text);
		return firstSelectedOption;
	
	}
	public boolean ddismultiselectoption(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		//System.out.println(multiple);
		return multiple;
	}
	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public Boolean explicitwaitforvisibility(long seconds , String idvalue) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Boolean until = w.until(ExpectedConditions.invisibilityOfElementLocated(By.id(idvalue)));
		return until;
	}
	public static void fluentwait(long sec , long sec1) {
		Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(sec1)).ignoring(Throwable.class);
	}
	public boolean verifyisdiplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		//System.out.println(displayed);
		return displayed;
	}
	public boolean verifyisselected(WebElement element) {
		boolean selected = element.isSelected();
		//System.out.println(selected);
		return selected;
	}
	public boolean verifyisenable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public static void dddeselectbyindex(WebElement element , int intex) {
		Select s = new Select(element);
		s.selectByIndex(intex);
	}
	public static void deselectbyattribute(WebElement element , String value) {
		Select s = new Select(element);
		s.selectByValue(value);
		}
	public static void dddeselectbytext(WebElement element , String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
		}
	public static void dddeselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
		}
	public String getparentwindow() {
		String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		return windowHandle;
	}
	public Set<String> getallwindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public static void cleartextbox(WebElement element) {
		element.clear();
	}
	public static void takescreenshot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
	}
	public static void takescreenshotforelement(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
	}
	public static void mouseoveractionforsingleoption(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void draganddrop(WebElement src , WebElement des) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src , des);
	}
	public static void rightclick() {
		Actions action = new Actions(driver);
		action.contextClick();
	}
	public static void doubleclick() {
		Actions action = new Actions(driver);
		action.doubleClick();
	}
	public static void insertvalueintextboxandenter(WebElement element , String data) {
		element.sendKeys(data,Keys.ENTER);
	}
	public static void refresgpage() {
		driver.navigate().refresh();
		//Navigation n = driver.navigate();
		//n.refresh();
	}
	public static void nextpage() {
		driver.navigate().forward();
	}
	public static void previouspage() {
		driver.navigate().back();
	}
	public static void gettheurlusingnavigate(String url) {
		driver.navigate().to(url);
		//Navigation navigate = driver.navigate();
		//navigate.to(url);
	}
	public static void keypress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}
	public static void keyRelease(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}
	private void keydown(CharSequence key) {
		Actions action = new Actions(driver);
		action.keyDown(key);
	}
	private void keyup(CharSequence key) {
		Actions action = new Actions(driver);
		action.keyUp(key);
	}	
	private void sendkeyuseactionclass(WebElement element, CharSequence keydown , CharSequence keys , CharSequence keyup) {
		Actions action = new Actions(driver);
		action.keyDown(element,keydown).sendKeys(element, keys).keyUp(element, keyup).perform();;
	}
	private List<WebElement> getallselectedoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	private List<WebElement> getrowsfromtable(WebElement element , String idvalue) {
		List<WebElement> findElements = element.findElements(By.id(idvalue));
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
		}
		return findElements;
		
		
	}
	private void sleep(long sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
