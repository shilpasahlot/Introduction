
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Installs//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("passenger")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		while(i<5) 
		{
			driver.findElement(By.className("icon-plus")).click(); //4times loop will run
			i++;
		}
		
		/*for(int i=1;i<5;i++);
		{
			driver.findElement(By.className("icon-plus")).click();
		
		}*/
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='passenger-done-blck']//button")).click();
				
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("passenger")).getText());
	
		

	}

}
