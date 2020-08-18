package homepage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(xpath="//nav[@id='site-navigation']//img[@title='QAAgility Technologies']")
	WebElement logo;
	
	@FindBy(xpath="//a[@href='https://twitter.com/qaagility']")
	WebElement twitterIcon;
	
	@FindBy(xpath="//footer[@class='site-info']//div[@class='copyright-bar']")
	WebElement footerTag;
	
	public void verifyTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("QAAgility"));
	}
	
	public void sizeAttribute()
	{
		
		System.out.println("Loge size is:- "+logo.getSize());
	}
	
	public void verifyTwitterIcon()
	{
		Assert.assertTrue(twitterIcon.isDisplayed());
	}
	
	public void verifyFooter()
	{
		Assert.assertTrue(footerTag.getText().contains("QAAgility Technologies © 2020. All Rights Reserved"));
	}

}
