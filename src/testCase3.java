import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  //selenium code-
				// Create driver object for InternetExplorer browser
				// We will stictly implement methods of webdriver
				
				
				/* Class name = FirefoxDriver,
				   X driver = new X();*/
				
				//invoke .exe file first
				
				System.setProperty("webdriver.ie.driver", " C:\\Installs\\MicrosoftWebDriver.exe");
				WebDriver driver = new InternetExplorerDriver();
				driver.get("https://google.com");
				System.out.println(driver.getTitle());
				
	}

}
