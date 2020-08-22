package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import homepage.Homepage;
import utility.BaseTestMenthods;
import utility.DriverBuilder;

public class QAAgilityTest extends BaseTestMenthods {
	
	@Test(enabled=false)
	public void loginTest()
	{
		WebDriver driver=DriverBuilder.getDriver();
		Homepage homepage=new Homepage(driver);
		driver.get("https://www.qaagility.com/");
		driver.manage().window().maximize();
		
		homepage.verifyTitle();
		homepage.sizeAttribute();
		homepage.verifyTwitterIcon();
		homepage.verifyFooter();
	}

}
