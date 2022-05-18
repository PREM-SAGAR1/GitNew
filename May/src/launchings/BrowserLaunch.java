package launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	 WebDriver driver;

	public static void main(String[] args)
	{
		 WebDriver driver;
		 
		//System.setProperty("webdriver.chrome.driver","E:\\march automation\\chromedriver_win32\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	
		
	//System.setProperty("webdriver.gecko.driver", "E:\\gecko 64 bit\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();

	 driver = new FirefoxDriver();

	}

}
