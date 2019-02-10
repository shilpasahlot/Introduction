import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //selenium code-
		// Create driver object for chrome browser
		// We will stictly implement methods of webdriver
		
		
		/* Class name = ChromeDriver,
		   X driver = new X();*/
		
		//invoke .exe file first
		
			System.setProperty("webdriver.chrome.driver", "C:\\Installs\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");   //hit url on browser
			System.out.println(driver.getTitle());   //validate if your page title is correct
			System.out.println(driver.getCurrentUrl());  //validate if you are landed on correct url
			
			driver.get("https:yahoo.com");
			driver.navigate().back();
			//driver.navigate().forward();
			driver.close();  //it closes current browser
			driver.quit();  //it closes all the browser opened by selenium script(when dealing with child windows)
			
			
	}
}