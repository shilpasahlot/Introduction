import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieBrowser {
	public static void main(String[]args) {
			
		System.setProperty("webdriver.ie.driver","C://Installs//MicrosoftWebDriver.exe" );
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://facebook.com");  
				
	}

}

