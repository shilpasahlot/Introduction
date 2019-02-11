import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());

	}

}
