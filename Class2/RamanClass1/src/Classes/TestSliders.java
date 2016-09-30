package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSliders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.browser.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(("https://jqueryui.com/resources/demos/slider/default.html"));
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,30L);
		//WebElement menu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>[data-tracking-id='men']")));
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		//WebElement slider=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default.ui-state-hover")));
		System.out.println(driver.findElement(By.cssSelector("#slider")).getLocation());
		System.out.println(driver.findElement(By.cssSelector("#slider")).getSize());
		WebElement slider=driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, 675, 0).perform();
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}