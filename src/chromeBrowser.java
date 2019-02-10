import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {
	public static void main(String[]args) {
			
		System.setProperty("webdriver.chrome.driver","C://Installs//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");  //URL in the browser
	   // ((WebElement) driver.findElement(By.id("email"))).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
	  //driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		
		
			
				
	}

}

