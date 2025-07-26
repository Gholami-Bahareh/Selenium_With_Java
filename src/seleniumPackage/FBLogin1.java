package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [@id = 'pass']")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		
		
	}

}

//input [@id = 'email']
//input [@id = 'pass']
//tagname[@attribute = 'value']