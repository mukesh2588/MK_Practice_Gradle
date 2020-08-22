package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import googleMaps.GoogleMaps;
import utility.BaseTestMenthods;
import utility.DriverBuilder;

public class GoogleMapTest extends BaseTestMenthods {
	
	
	@Test
	public void searchDestination()
	{
		WebDriver driver=DriverBuilder.getDriver();
		GoogleMaps googlemap=new GoogleMaps(driver);
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		
		googlemap.enterDestination("Wankhede Stadium");
		googlemap.searchDestination();
		googlemap.verifyTitle();
		googlemap.printReview();
	}
	
	

}
