package seleniumPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBCreatNewAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']")).click();
		
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("bahareh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("gholami");
		Thread.sleep(1000);
				
		
		List<WebElement> Birthmonth = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		Birthmonth.get(6).click();
		Thread.sleep(1000);
		
		List<WebElement> Birthday = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		Birthday.get(26).click();
		Thread.sleep(1000);
		
		List <WebElement> Birthyear = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		Birthyear.get(39).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("bahareh@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456789");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		

		
		Thread.sleep(16000);
		driver.quit();
	}

}
