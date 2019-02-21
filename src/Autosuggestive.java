import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		WebElement origin = driver.findElement(By.id("fromPlaceName"));
		origin.sendKeys("beng");
		origin.sendKeys(Keys.DOWN);
		//System.out.println(origin.getText()); -- can't return any text because its hidden element so have to use Javascript DOM.
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		String result = "Bengaluru Internation Aiport";
		int i = 0;
		while(!text.equalsIgnoreCase(result)) 
		{
			i++;
			origin.sendKeys(Keys.DOWN);
		    text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) 
			{
				break;
			}
		}
		if(i>10) 
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Element found");
		}
		
	}

}
