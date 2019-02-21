import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement autosuggestive = driver.findElement(By.id("autocomplete"));
		autosuggestive.sendKeys("IND");
		autosuggestive.sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		//OR instead of JavascriptExecutor use this to get value
		//System.out.println(autosuggestive.getAttribute("value"));
		
		int i = 0;
		while(!text.equalsIgnoreCase("India")) 
		{
			i++;
			autosuggestive.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>5) 
			{
				break;
			}
		}
		if(i>5) 
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Element found");
		}
		

	}

}
