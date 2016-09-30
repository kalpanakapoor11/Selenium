package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod

	public void UserIdCreation()
	{
	System.out.println("userid creation");
		
	}
	@BeforeTest
    public void cookies()
	{
		System.out.println("Delete Cookies before test");
	}
	@AfterTest
	public void cookiesclose()
	{
		System.out.println("Delete cookies after test");
	}
	
	@Test
	public void OpenBrowser()
	{
	System.out.println("Opening browser");
	
	}
	@AfterMethod
	public void report()
	{
		System.out.println("Report generation");
	}
	
@Test
	public void LoginLogout()
	{
		System.out.println("Login and logout");
	}
}