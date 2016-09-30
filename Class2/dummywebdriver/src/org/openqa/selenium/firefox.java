package org.openqa.selenium;

public class firefox {
	public firefox()
	{
		System.out.println("launch firefox");
	}
	public void get(String url)
	{
		System.out.println("navigating to the "+url+" to firefox");
	}
	public void getTitle()
	{
		System.out.println("Print the title of firefox");
	}
	public void click()
	{
		System.out.println("click on the element in firefox");
	}
	public void sendkeys()
	{
		System.out.println("type in input box in firefox");
	}
	
	public static void main(String[]args)
	{
		firefox driver = new firefox();
		driver.get("https://google.com");
		driver.getTitle();
		driver.click();
		driver.sendkeys();
			
		
	}

}
