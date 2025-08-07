package redBus.Tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import redBus.PageObjects.homePage;
import redBus.components.baseTest;
import redBus.PageObjects.busSearchResultsPage;
import redBus.PageObjects.busAndPassengerDetailsPage;
import org.testng.annotations.Test;

public class busTicketBooking {
	
	@Test
	public static void busTicketBookingTC() throws InterruptedException, IOException {
		
		baseTest baseTestObject=new baseTest();
		
		WebDriver driver=baseTestObject.launchApplication("https://www.redbus.in/");
		
		homePage homePageObject=new homePage(driver);
		
		homePageObject.busSearchAction("Chennai");
		
		busSearchResultsPage busSearchResultsPageObject=new busSearchResultsPage(driver);
		
		busSearchResultsPageObject.sortByDeparture();
		
		busSearchResultsPageObject.scrollingAndFindingTheBus("Dream Line Travels Pvt Ltd", 0, 250);
		
		busAndPassengerDetailsPage busAndPassengerDetailsPageObject=new busAndPassengerDetailsPage(driver);
		
		busAndPassengerDetailsPageObject.busDetailsSelection();
		
		busAndPassengerDetailsPageObject.passengerDetailsSelection("9876756545", "arjun@gmail.com", "Arjun", "30");
		
	}

}
