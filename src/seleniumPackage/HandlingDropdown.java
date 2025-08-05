package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//here instead of Thread.sleep(); we will have ***implicit wait***
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
				
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']")).click();
				
		List<WebElement> Birthmonth = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		//we have 12 of this : //select[@id=\"month\"]/option
		//we create a list of all 12 elements *** PAY ATTENTION that this time we have findElements(.... ""elements" , since they are 12
		Birthmonth.get(6).click();
		Thread.sleep(1500);
		
		List<WebElement> Birthday = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		Birthday.get(26).click();
		Thread.sleep(1500);
		
		List <WebElement> Birthyear = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		Birthyear.get(39).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
