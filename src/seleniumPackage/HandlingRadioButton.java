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
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']")).click();
//		driver.findElement(By.xpath("//a[@class= '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//a[@href= '/r.php?entry_point=login']")).click();
//		driver.findElement(By.xpath("//a[@id= 'u_0_0_bK']")).click(); //XXXXXXX
		// in some sites like facebook, ID is generated again by reloading the page , dynamic ID
		
//		<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="/r.php?entry_point=login" 
//				ajaxify="" id="u_0_0_bK" data-testid="open-registration-form-button">Create new account</a>
		
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