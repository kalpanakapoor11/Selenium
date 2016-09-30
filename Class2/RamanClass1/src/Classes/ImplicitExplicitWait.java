package Classes;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {
	public static WebDriver driver;
	
	public static boolean isElementpPresent(String name){
		
		int size=driver.findElements(By.name(name)).size();
		if (size==0){
			return false;
		}else{
			return true;
		}
		/*try{
			driver.findElement(By.name(name));
			return true;
		}catch(Exception e){
		return false;
		}
		*/
	}
	public static void main(String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://gmail.com");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	
	WebElement user=driver.findElement(By.name("Email"));
	user.sendKeys("878");
	driver.findElement(By.name("signIn")).click();;
	
	//WebDriverWait wait= new WebDriverWait(driver,3L);
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(20,TimeUnit.SECONDS)
				.withMessage("This is a user defined timeout")
				.ignoring(NoSuchElementException.class);
				
	System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errormsg_0_Email"))).getText());
	
	
//	System.out.println("Valid button: "+ driver.findElement(By.name("signIn")).isDisplayed());
	System.out.println("Invalid button: "+ isElementpPresent("signIn"));
	//Thread.sleep(20);
//	System.out.println(driver.findElement(By.id("errormsg_0_Email")).isDisplayed());
//	System.out.println(driver.findElement(By.id("errormsg_0_Email")).getText());

	driver.quit();
	}
	private static Object withMessage(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
