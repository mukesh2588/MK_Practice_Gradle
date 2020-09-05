package googleMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class GoogleMaps {
	WebDriver driver;
	
	public GoogleMaps(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name="q")
	WebElement search;
	
//	@FindBy(xpath="//button[@id='searchbox-searchbutton']")
	@FindBy(id="searchbox-searchbutton")
	WebElement searchDestination;
	
	@FindBy(xpath="//div[@id='pane']//span[contains(text(),'Stadium') and not(contains(@class,'section-review-text'))]")
	WebElement resultHeader;
	
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
	public void verifyHeader()
	{
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(resultHeader));
		Assert.assertTrue(resultHeader.isDisplayed());*/
		Assert.assertTrue(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(resultHeader)).isDisplayed());
	}
	
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Wankhede Stadium - Google Maps");
	}
	
	public void printReview()
	{
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(printReview));
		System.out.println(printReview.getText());
	}
	

}
