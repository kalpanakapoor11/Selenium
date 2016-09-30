import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestWebApp {
	public static AndroidDriver driver;
	public static void main(String[]args) throws MalformedURLException{
		
		DesiredCapabilities capabilities1=new DesiredCapabilities();
		capabilities1.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities1.setCapability("device", "Android");
		capabilities1.setCapability("deviceName", "HTCOne");
		capabilities1.setCapability("PlatformVersion", "5.0.2");
		capabilities1.setCapability("platformName", "Android");
		//capabilities.setCapability("appPackage", "io.selendroid.testapp");
		//capabilities.setCapability("appActivity", ".HomeScreenActivity");
		
		driver=new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),capabilities1);
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Hello Appium");
		driver.quit();
	}

}
