package redBus.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class homePage extends abstractComponents{
	
	WebDriver driver;
	
	public homePage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='From']")
	WebElement fromLocationTextBox;
	
	@FindBy(xpath="//input[@id='srcDest']")
	WebElement srcTextBox;
	
	@FindBy(xpath="//div[text()='Koyambedu']")
	WebElement srcClick;
	
	@FindBy(xpath="//div[text()='Bangalore']")
	WebElement destClick;
	
	@FindBy(xpath="//span[text()='Date of Journey']")
	WebElement calendarClick;
	
	@FindBy(xpath="//span[text()='31']")
	WebElement dateClick;
	
	@FindBy(xpath="//button[text()='Search buses']")
	WebElement searchBuses;
	
	public void busSearchAction(String srcLocation) {
		
		fromLocationTextBox.click();
		srcTextBox.sendKeys(srcLocation);
		srcClick.click();
		destClick.click();
		calendarClick.click();
		dateClick.click();
		searchBuses.click();
		
	}

}
