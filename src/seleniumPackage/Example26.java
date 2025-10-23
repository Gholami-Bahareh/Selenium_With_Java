package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Example26 {
	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
        Thread.sleep(10000);
		
		WebElement userNumber = driver.findElement(By.xpath("//input[@class = \"form-control text-muted\"]"));
		userNumber.sendKeys("1234567");
		Assert.assertEquals(userNumber.getAttribute("value"),"1234567", "ID id not typed corectly");
		
		WebElement continueButton = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		continueButton.click();
		

}}
