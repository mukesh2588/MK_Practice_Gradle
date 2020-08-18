package utility;

import org.testng.annotations.BeforeMethod;


public class BaseTestMenthods {
	@BeforeMethod
	public void setup()
	{
		DriverBuilder.createDriver();
				
	}
	/*@AfterMethod
	public void endTest()
	{
		DriverBuilder.getDriver().quit();
				
	}*/

}
