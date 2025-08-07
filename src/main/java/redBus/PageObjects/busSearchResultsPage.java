package redBus.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class busSearchResultsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busSearchResultsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='Departure time']")
	WebElement sortingButton;
	
	@FindBy(xpath="//div[contains(@class,'travelsName___')]")
	List<WebElement> busListWE;
	
	public void sortByDeparture() {
		
		sortingButton.click();
		
	}
	
	public void scrollingAndFindingTheBus(String busName, int x, int y) throws InterruptedException {
		
		int i=0;
		
		outer:
		while(i<1000) {
		
		javaScriptExecutor("window.scrollBy("+x+","+y+")");
		
		List<WebElement> busLists=busListWE;
		
		int index=1;
		
		inner:
		for(WebElement busList:busLists) {
			
			
			if(busList.getText().equalsIgnoreCase(busName)) {
				
				System.out.println("We found :" +busName);
				Thread.sleep(1000);
				
				jsScrollingToView("arguments[0].scrollIntoView(false);", busList);
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//button[text()='View seats'])["+index+"]")).click();
				
				break outer;
			}
			
			index++;
			
		}		
		
	}
		
	}
	
}
