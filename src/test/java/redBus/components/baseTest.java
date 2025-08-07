package redBus.components;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class baseTest {
	
	WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties properties=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\91956\\eclipse-workspace\\SeleniumFITA2025-FW-2\\src\\main\\java\\redBus\\resources\\globalProp.properties");
		
		properties.load(fis);
		
		String browserName=properties.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public WebDriver launchApplication(String siteURL) throws IOException {
		
		initializeDriver();
		driver.get(siteURL);
		return driver;
		
	}

}
