package launchings;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.tools.sjavac.Log;

public class TC_003 extends BaseTest
{
	
	private  static final Logger log = Logger.getLogger("TC_003");

	public static void main(String[] args) throws Exception 
	
	{

		
		
           init();
           
          log.info("Init the properties files....");
		
		launch("chromebrowser");
		log.info("Launching the Browser :-"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to Url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		log.info("Selected the option Books By using the locator :-"+ orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_name","Harry potter");
		log.info("Entered the text Harry Potter by using the locator :-"+orProp.getProperty("amazontextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the element by using the locator :-"+orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		
		/*//driver.findElement(By.linkText("Customer Service")).click();
		
		
		//driver.findElement(By.partialLinkText("Customer Serv")).click();

		
		/*List<WebElement> elements  = driver.findElements(By.tagName("a"));
		
		for(int i =0;i<elements.size();i++)
		{
			
			if(!elements.get(i).getText().isEmpty());
			System.out.println(elements.get(i).getText());
		}*/
		
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/
		
		
	}

	
}
