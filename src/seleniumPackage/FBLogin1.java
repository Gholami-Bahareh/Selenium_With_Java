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
//		driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("abc123;@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Email or phone number']")).sendKeys("abc123;@gmail.com");
//		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal-email" 
//				placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input [@data-testid = 'royal-pass']")).sendKeys("1234");
//		driver.findElement(By.xpath("//input [@class = 'inputtext _55r1 _6luy _9npi']")).sendKeys("1234");
		driver.findElement(By.xpath("//input [@aria-label = 'Password']")).sendKeys("1234");
//		<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal-pass" 
//				placeholder="Password" aria-label="Password">
//		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		
		
	}

}

//input [@id = 'email']
//input [@id = 'pass']
//tagname[@attribute = 'value']