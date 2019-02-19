import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment4 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//Step1- Select any checkbox
		driver.findElement(By.xpath("//body/div[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		
		//Step2- Grab the text of checkbox and put in a variable
		String a =(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		
		//Step3- Select an option in dropdown. here the option should come from step2
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByVisibleText(a);
		
		//Step4- Enter the step2 grabbed text in editbox
		driver.findElement(By.xpath("//body/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(a);
		
		//Step5- Click on Alert and verify the java popup contains the text of step2
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String r =(driver.switchTo().alert().getText());
		if(r.contains(a))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	}
	

}
