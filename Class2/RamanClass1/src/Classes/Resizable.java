package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.browser.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(("https://jqueryui.com/resources/demos/resizable/default.html"));
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,30L);
		//WebElement menu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>[data-tracking-id='men']")));
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		WebElement resizable=driver.findElement(By.xpath("//div[3]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(resizable, 300, 300).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}