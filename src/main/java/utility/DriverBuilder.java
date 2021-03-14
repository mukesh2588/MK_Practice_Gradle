package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverBuilder {

	static String driverPath=System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\";

	static WebDriver driver;

	public static void createDriver(String browser)
	{
		switch(browser.toUpperCase())
		{
		case "CHROME":
			//ChromeOptions chromeOptions= new ChromeOptions(); **give explicit chrome browser path
			//chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		//	driver=new ChromeDriver(chromeOptions);
			driver=new ChromeDriver();
			break;
		
		default:
			System.out.println("Browser "+browser+" Not found");

		}

	}
	
	public static void createDriver()
	{
		
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver=new ChromeDriver();
			
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}


	
	







}
