package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import utility.ExcelReader;

public class TestBase {
	public static WebDriver driver;
	public static Properties OR= new Properties();
	public static Properties config=new Properties();
	public static FileInputStream fis;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Credentials.xlsx");
		
	@BeforeSuite()
	public void setup() throws IOException{
		if(driver==null){
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis);
			log.debug("OR property file loaded");
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			log.debug("config property file loaded");
			/*
			if(config.getProperty("browser").equals("chrome")){
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver=new ChromeDriver();
			
				
			}else 
				if(config.getProperty("browser").equals("ie")){
				System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				
			}else if(config.getProperty("browser").equals("firefox")){
				log.debug("firefox initialized");
				driver=new FirefoxDriver();
				
			}else if(config.getProperty("browser").equals("AndroidDriver"))*/
		
				log.debug("Android initialized");
				DesiredCapabilities capabilities=new DesiredCapabilities();
				
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
				capabilities.setCapability("device", "Android");
				capabilities.setCapability("deviceName", "HTCOne");
				capabilities.setCapability("PlatformVersion", "5.0.2");
				capabilities.setCapability("platformName", "Android");
				//capabilities.setCapability("appPackage", "io.selendroid.testapp");
				//capabilities.setCapability("appActivity", ".HomeScreenActivity");
				driver=new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),capabilities);
				
			}
			
			
			log.debug("Navigated to"+config.getProperty("url"));

			driver.get(config.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(15L,TimeUnit.SECONDS);
			//DBManager.setMysqlDbConnection();
			}
		
		
	@AfterSuite()
	public void teardown(){
		driver.quit();
	}

}
