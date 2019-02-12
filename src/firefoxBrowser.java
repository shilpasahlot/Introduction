import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxBrowser {
	public static void main(String[]args) {
			
		System.setProperty("webdriver.gecko.driver","C://Installs//geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");  
		
	}

}

