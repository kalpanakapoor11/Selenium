import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://virgin-red-dev.appspot.com");
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		WebElement Uname = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username"))));
		Uname.sendKeys("adminred12@backoffice.com");
		WebElement Psw = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password"))));
		Psw.sendKeys("testing");
		//driver.findElement(By.partialLinkText("Forgot Password?")).click();
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("html/body/div[1]/div/div[2]/div/form/button"))));
		while 
		Login.click();
		System.out.println(driver.getTitle());
		System.out.println("Login Successfull");
		
	}
}
