import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com/");
		
		/*driver.findElement(By.id("hp-widget__sfrom")).clear();                       
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("MUM");
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);*/
	
		//OR
		
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		int i = 1;
		while(i<5)
		{
			destination.sendKeys(Keys.ARROW_DOWN);
			i++;
		}
		destination.sendKeys(Keys.ENTER);
	}

	
}
