package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utility.testutil;

public class TestWebApp extends TestBase {
	
	@Test(dataProvider="getData")
	
	public void Login(String username,String password){
		
		log.debug(driver.getTitle());
		
		log.debug("Inside login test");
		//driver.findElement(By.name(OR.getProperty("Sign"))).click();
		driver.findElement(By.name(OR.getProperty("uname"))).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(15L,TimeUnit.SECONDS);
		driver.findElement(By.id(OR.getProperty("login"))).click();		
		driver.findElement(By.name(OR.getProperty("pword"))).sendKeys(password);
		
		
		driver.findElement(By.id(OR.getProperty("SignIN"))).click();
		log.debug("login successfully");
		
	}
	
	
@DataProvider
	
	public static Object[][] getData(){
		
	return testutil.getData("Credentials");		
	}

}
