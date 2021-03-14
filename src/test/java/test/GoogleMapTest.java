package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import googleMaps.GoogleMaps;
import utility.BaseTestMenthods;
import utility.DriverBuilder;

public class GoogleMapTest extends BaseTestMenthods {
	
	
	@Test(invocationCount = 2)/*this will run test case 2 times*/
	public void searchDestination()
	{
		WebDriver driver=DriverBuilder.getDriver();
		GoogleMaps googlemap=new GoogleMaps(driver);
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		
		googlemap.enterDestination("Wankhede Stadium");
		googlemap.searchDestination();
		googlemap.verifyTitle();
		googlemap.verifyHeader();
		googlemap.printReview();
	}
	
	

}
