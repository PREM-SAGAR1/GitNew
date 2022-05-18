package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import launchings.BaseTest;

public class Verify3 extends BaseTest {

	public static void main(String[] args) throws Exception
	{
		
		init();
		test = rep.createTest("Verify3");
		 test.log(Status.INFO,"Init the properties files....");

		
		
		
		launch("chromebrowser");
		test.log(Status.INFO, "Launching the Browser :-"+p.getProperty("chromebrowser"));

		
		navigateUrl("amazonurl");
		test.log(Status.INFO," Navigated to Url : " + childProp.getProperty("amazonurl"));

		
		driver.manage().window().maximize();
		
		String expectedLink  = "Customer Service";
		if(!isLinkEqual(expectedLink))
			//System.out.println("Both links are not equal...");
			
			reportFailure("Both links are not equal");
			
			
		else
			//System.out.println("Both links are equal....");
			reportSuccess("Both links are equal....");
		
		
		
		rep.flush();
		

	}

	

	
	}

