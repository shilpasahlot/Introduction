import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello!");
		driver.findElement(By.name("pw")).sendKeys("12345");
		//driver.findElement(By.className("button r4 wide primary")).click();//Error bcz of compound class name
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		

	}

}
