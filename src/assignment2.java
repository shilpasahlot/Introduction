import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		
		//Calendar
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		//DD
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("3");
		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("2");
		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByValue("1");
		
		//Link
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo Airlines");
		
		//Search
		driver.findElement(By.id("SearchBtn")).click();
		
		//Error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}
}
