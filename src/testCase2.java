import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testCase2 {

	public static void main(String[] args) {
		  //selenium code-
				// Create driver object for Firefox browser
				// We will stictly implement methods of webdriver
				
				
				/* Class name = FirefoxDriver,
				   X driver = new X();*/
				
				//invoke .exe file first
				
		System.setProperty("webdriver.gecko.driver", "C:\\Installs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

//		File pathBinary = new File("C:\\Users\\Shilpa\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
//		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
//		DesiredCapabilities desired = DesiredCapabilities.firefox();
//		FirefoxOptions options = new FirefoxOptions();
//		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//		WebDriver driver = new FirefoxDriver(options);
		
		
	}

}
