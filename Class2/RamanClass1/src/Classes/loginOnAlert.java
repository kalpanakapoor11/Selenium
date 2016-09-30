package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginOnAlert {

	public static void main(String[] args) {
		System.setProperty("driver.brower.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(("http://grcdev:nearlythere@getproactiv-ca.stg01.grdev.com/"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
		
		
		
	}

}
