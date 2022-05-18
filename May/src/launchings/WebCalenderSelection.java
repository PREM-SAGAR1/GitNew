package launchings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebCalenderSelection {

	public static void main(String[] args)
	
	{
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.goibibo.com/");
     
     driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		
	while(!driver.findElement(By.xpath(null)).getText().contains("August 2022"))
	{
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
		}
	
	List<WebElement> dateList = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div"));
	
	for(int i =0;i<dateList.size();i++)
	{
		
		String dateText = dateList.get(i).getText();
		
		System.out.println(dateText);
		
		if(dateList.get(i).getText().equals(14))
		{
			dateList.get(i).click();
			break;
		}
		
	}
	
	
	}

}
