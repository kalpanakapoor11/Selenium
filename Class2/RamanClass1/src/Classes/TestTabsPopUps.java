package Classes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTabsPopUps {

	public static void main(String[] args) {
		System.setProperty("driver.browser.chromedriver", "chromedriver.exe");
		//ProfilesIni listprofile=new ProfilesIni();
		//FirefoxProfile profile= listprofile.getProfile("default");
		WebDriver driver=new ChromeDriver(/*profile*/);
		driver.navigate().to(("http://www.hdfcbank.com/"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Set<String> winids=driver.getWindowHandles();
		Iterator<String> iterate =winids.iterator();
		String first_window=iterate.next();
		driver.getWindowHandles();
		winids=driver.getWindowHandles();
		iterate =winids.iterator();
		System.out.println(iterate.next());//first window id
		String second__window=iterate.next();
		System.out.println(second__window);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/ul/li[3]/a")).click();
		
		
		

		
	}

}
