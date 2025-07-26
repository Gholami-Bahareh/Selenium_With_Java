package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value= '1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value= '2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value= '-1']")).click();		
	}
}

//tagName[@attributeName = 'attribute value']

//a[@data-testid= 'open-registration-form-button']
//input[@value= '1']
//input[@value= '-1']