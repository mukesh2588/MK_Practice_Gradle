package googleMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class GoogleMaps {
	WebDriver driver;
	
	public GoogleMaps(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	
	@FindBy(xpath="//button[@id='searchbox-searchbutton']")
	WebElement searchDestination;
	
	//@FindBy(xpath="//div[@jstcache='663']")
	
	@FindBy(xpath="//button[@jsaction='pane.rating.moreReviews']")
	WebElement printReview;
	
	public void enterDestination(String enterdestination)
	{
		search.sendKeys(enterdestination);
	}
	
	public void searchDestination()
	{
		searchDestination.click();
	}
	
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Wankhede Stadium - Google Maps");
	}
	
	public void printReview()
	{
		printReview.getText();
	}
	

}
