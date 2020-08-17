package utility;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTestMenthods {
	@BeforeMethod
	public void setup(ITestContext itestContext, Method method)
	{
		String testMethodName = method.getName();
		String browserName = itestContext.getCurrentXmlTest().getParameter("browser");
		DriverBuilder.createDriver(browserName);
		
		
	}
	/*@AfterMethod
	public void endTest()
	{
		DriverBuilder.getDriver().quit();
				
	}*/

}
