import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());  // to get the text of java pop-up
		//driver.switchTo().alert().sendKeys("Hello!"); //if you have write in popup 
		driver.switchTo().alert().accept();  //accept = ok, done, yes
		//driver.switchTo().alert().dismiss();  //dismiss = cancel, no
	}

}
