import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spinbot.com/Login");
		int number = findFrameNumber(driver,By.cssSelector(".recaptcha-checkbox-checkmark"));
		driver.switchTo().frame(number);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
		
		/*driver.switchTo().defaultContent();
		int number1 = findFrameNumber(driver,By.cssSelector("#recaptcha-verify-button"));
		driver.switchTo().frame(number1);
		driver.findElement(By.cssSelector("#recaptcha-verify-button")).click();*/
		
	}
	public static int findFrameNumber(WebDriver driver, By by)
	{
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		
		for(i=0; i<frameCount; i++) 
		{
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			
			if(count>0) 
			{
				break;
			}
			else 
			{
				System.out.println("Continue looping");
			}
			driver.switchTo().defaultContent();
		}
		driver.switchTo().defaultContent();
		return i;
		
	}
	
}
