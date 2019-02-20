import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@value='Date of Travel']")).click();
		
		//while loop will keep on executing till it becomes false
		//for selecting month
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}
		
		//Grab the common attribute, put it into list,iterate.
		//for selecting date
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for(int i=0; i<count; i++) 
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
