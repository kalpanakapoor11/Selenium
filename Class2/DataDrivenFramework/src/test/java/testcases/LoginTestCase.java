package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import utility.testutil;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class LoginTestCase extends TestBase {
	@Test(dataProvider="getData",groups="sanity")
	
	public void Login(String username,String password) throws InterruptedException{
		
		log.debug(driver.getTitle());
		
		log.debug("Inside login test");
		driver.findElement(By.name(OR.getProperty("uname"))).sendKeys(username);
				
		driver.findElement(By.name(OR.getProperty("pword"))).sendKeys(password);
		
		
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		log.debug("login successfully");
		Thread.sleep(1000);
	}
	
	
@DataProvider
	
	public static Object[][] getData(){
		
	return testutil.getData("Credentials");		
	}

}
