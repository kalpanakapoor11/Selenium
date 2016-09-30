package Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","Chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://wikipedia.org");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Dansk");
		//select.selectByValue("hi");
		//System.out.println(select.getOptions());
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println(values.get(0).getAttribute("value"));
		System.out.println("Total values are " +values.size());
		
		for(int i=0;i<values.size();i++){
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		List<WebElement> block=driver.findElements(By.xpath("html/body/div[4]"));
		List<WebElement> links=((WebElement) block).findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links){
			System.out.println("url is: "+ link.getAttribute("href")+" and text are "+link.getText());
		}

			
		
		System.out.println("-----Printing link--------");
		
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links){
			System.out.println("url is: "+ link.getAttribute("href")+" and text are "+link.getText());
		}

*/		
		driver.quit();
		
		
		

	}

}
