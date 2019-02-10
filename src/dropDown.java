import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.airindia.in/");
		Select s = new Select(driver.findElement(By.id("ddladult1")));
		s.selectByValue("2");
		s.selectByIndex(5);//to get 6adults bcz Index works from 0
		s.selectByVisibleText("3");
				
	//all this syntax will work only when we have a static dropdown having "select" tagname
	}

}
