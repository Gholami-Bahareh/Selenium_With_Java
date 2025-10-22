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

public class Example25 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//String originalWindow = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement rejectAllButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"onetrust-reject-all-handler\"]")));
		rejectAllButton.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope\"]"));
//		loginButton.click();
		Actions a = new Actions(driver);
		a.moveToElement(loginButton).perform();

		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//div[@class=\"login_link\"]"));
		dropDownOptions.get(0).click();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String parent = i.next();
		String child = i.next();
		
		driver.switchTo().window(child);
		
		Thread.sleep(2000);
		
		WebElement userNumber = driver.findElement(By.xpath("//input[@class = \"form-control text-muted\"]"));
		userNumber.sendKeys("1234567");
		
		
//		Thread.sleep(2000);
//		driver.quit();
//		
		
	}

}
