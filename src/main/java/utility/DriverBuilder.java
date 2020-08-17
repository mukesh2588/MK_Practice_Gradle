package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBuilder {

	static String driverPath=System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\";

	static WebDriver driver;

	public static void createDriver(String browser)
	{
		switch(browser.toUpperCase())
		{
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
		
		default:
			System.out.println("Browser "+browser+" Not found");

		}

	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}


	
	







}
