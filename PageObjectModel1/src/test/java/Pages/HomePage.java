package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.TestBase;

public class HomePage extends TestBase {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	
	public void doLogin(String username, String password){
	driver.findElement(By.xpath(OR.getProperty("uname"))).sendKeys(username);
	driver.findElement(By.xpath(OR.getProperty("login"))).sendKeys(password);
	driver.findElement(By.xpath(OR.getProperty("pword"))).click();
	}
	
	public void doSignUp(){
		
	}
	public void validateitems(){
		
	}
}

