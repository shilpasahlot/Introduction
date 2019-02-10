import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Installs//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello!");
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

		
		
 }
}
