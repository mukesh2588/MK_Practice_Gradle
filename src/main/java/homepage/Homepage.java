package homepage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="/html/body/nav[1]/div/div[1]/a/img")
	WebElement logo;
	
	
	public void verifyTitle()
	{
		assertTrue(driver.getTitle().contains("QAAgility"));
	}
	
	public void sizeAttribute()
	{
		logo.getAttribute("size");
	}

}
