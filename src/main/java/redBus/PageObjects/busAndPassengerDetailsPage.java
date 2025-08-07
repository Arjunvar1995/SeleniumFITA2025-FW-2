package redBus.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class busAndPassengerDetailsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busAndPassengerDetailsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[contains(@class,'bottomSheetContainer___')] //button[contains(@class,'actionButton___')]")
	WebElement loginPopupCloseButton;
	
	@FindBy(xpath="//span[@id='U14']")
	WebElement seat;
	
	@FindBy(xpath="//button[text()='Select boarding & dropping points']")
	WebElement boardDropButton;
	
	@FindBy(xpath="//div[text()='Maduravoyal']")
	WebElement boardPoint;
	
	@FindBy(xpath="//div[text()='Electronic City']")
	WebElement dropPoint;
	
	@FindBy(xpath="//input[@name='Phone']")
	WebElement phoneTextBox;
	
	@FindBy(xpath="//input[@placeholder='Enter email id']")
	WebElement mailTextBox;
	
	@FindBy(xpath="//label[text()='State of Residence']//following-sibling::input")
	WebElement stateClick;
	
	@FindBy(xpath="//div[text()='Tamil Nadu']")
	WebElement tnClick;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement nameTextBox;
	
	@FindBy(xpath="//input[@placeholder='Enter Age']")
	WebElement ageTextBox;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement genderClick;
	
	@FindBy(xpath="//div[text()='Don’t add redBus Assurance']")
	WebElement insureOptionClick;
	
	@FindBy(xpath="//button[text()='Continue booking']")
	WebElement continueBookButton;
	
	public void busDetailsSelection() {
		
		//loginPopupCloseButton.click();
		seat.click();
		boardDropButton.click();
		boardPoint.click();
		dropPoint.click();
		
	}
	
	public void passengerDetailsSelection(String phoneNum, String mailID, String name, String age) {
		
		phoneTextBox.sendKeys(phoneNum);
		mailTextBox.sendKeys(mailID);
		stateClick.click();
		tnClick.click();
		nameTextBox.sendKeys(name);
		ageTextBox.sendKeys(age);
		genderClick.click();
		insureOptionClick.click();
		continueBookButton.click();
		
	}

}
