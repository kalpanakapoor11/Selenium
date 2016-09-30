package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseOver {

	public static void main(String[] args) {
		System.setProperty("driver.browser.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(("http://flipkart.com"));
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,30L);
		//WebElement menu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>[data-tracking-id='men']")));
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		WebElement menu=driver.findElement(By.cssSelector("li>[data-tracking-id='men']"));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Boots")).click();
		
		driver.quit();
		
	}

}
