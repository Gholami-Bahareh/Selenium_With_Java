package seleniumPackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Example25 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String titleMain = driver.getCurrentUrl();
		Assert.assertTrue(titleMain.contains("hdfcbank"),("the URL is not correct"));
		
		//String originalWindow = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement rejectAllButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"onetrust-reject-all-handler\"]")));
		rejectAllButton.click();
		
//		Thread.sleep(3000);
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("onetrust-banner-sdk")));
		System.out.println("Cookie banner is now invisible as expected");
		
		Assert.assertFalse(driver.findElement(By.id("onetrust-banner-sdk")).isDisplayed(),"Cookie banner is still visible!");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope\"]"));
//		loginButton.click();
		Actions a = new Actions(driver);
		a.moveToElement(loginButton).perform();

		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//div[@class=\"login_link\"]"));
		
		Assert.assertFalse(dropDownOptions.isEmpty(),"Dorp Down is empty");  
		
		dropDownOptions.get(0).click();
		
		Set<String> handels = driver.getWindowHandles();
		Assert.assertTrue(handels.size()>1,"new tab is not oppened");
		
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String parent = i.next();
		String child = i.next();
		
		driver.switchTo().window(child);
		
		String titleSecond = driver.getCurrentUrl();
		Assert.assertTrue(titleSecond.contains("netbanking"),("the URL is not correct"));
		
//		Thread.sleep(2000);
		driver.switchTo().frame("login_page");
		
		WebElement userNumber = driver.findElement(By.xpath("//input[@class = \"form-control text-muted\"]"));
		
		Assert.assertTrue(userNumber.isDisplayed(),"cant find the Customer ID/ User ID field");
		
		userNumber.sendKeys("1234567");
		
		Assert.assertEquals(userNumber.getAttribute("value"),"1234567", "ID id not typed corectly");
		
		WebElement continueButton = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		continueButton.click();
				
		
//		Thread.sleep(2000);
//		driver.quit();
//		
		
	}

}
