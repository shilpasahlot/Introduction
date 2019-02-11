import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());  //it will give false in result bcz checkbox is not selected.
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//count total no of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
