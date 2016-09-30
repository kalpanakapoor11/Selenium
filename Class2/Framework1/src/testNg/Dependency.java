package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void Open()
	{
		System.out.println("Open browser");
	}
	
 @Test
	public void flight()
	{
		System.out.println("Flight booking");
	}

}
