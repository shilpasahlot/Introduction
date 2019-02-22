import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://INSTALLS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21646/afg-vs-ire-1st-t20i-afghanistan-v-ireland-in-india-2019");
		WebElement table = driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		//int rowCount = driver.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size(); 
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum = 0;
		for(int i =0; i<count-2; i++) 
		{
			String value =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//System.out.println(value);
			int valueInteger =Integer.parseInt(value);
			sum =sum+valueInteger;
		}
			System.out.println(sum);
			String extras =(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
			int extrasInteger = Integer.parseInt(extras);
			int Totalsum =sum+extrasInteger;
			System.out.println(Totalsum);
			System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
