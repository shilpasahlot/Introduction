import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("hello!");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("12345");
		driver.findElement(By.cssSelector("[id='Login']")).click();

	}

}
