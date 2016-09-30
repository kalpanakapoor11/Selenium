package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation2 {
	
	@BeforeSuite
	public void softwareinstall()
	{
		System.out.println("beforesuite test called");
	}
	@AfterSuite
	public void desoftwareinstall()
	{
		System.out.println("Aftersuite test called");
	}
	

}
