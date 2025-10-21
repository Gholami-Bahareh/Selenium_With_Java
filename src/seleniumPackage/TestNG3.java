package seleniumPackage;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG3 {
	WebDriver driver;
	
	@Test (priority=1,invocationCount = 2)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 		}
	@Test (priority=2)
	public void username(){
		driver.findElement(By.xpath("//input[@placeholder = 'Email or phone number']")).sendKeys("abc123;@gmail.com");	}
	
	@Test (priority=3)
	public void password(){
        driver.findElement(By.xpath("//input [@aria-label = 'Password']")).sendKeys("1234");		}
	@Test (priority=4)
	public void clickOnbutton(){
		driver.findElement(By.xpath("//button[@name = 'login']")).click();	}
}
