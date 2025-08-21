package seleniumPackage;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingDynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//here instead of Thread.sleep(); we will have ***implicit wait***
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://money.rediff.com/quotes/all/gainersgainers");
		driver.findElement(By.xpath("//a[contains(text(),'Gainers')]")).click();
		driver.manage().window().maximize();
		
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]"));
		System.out.println( allCompanies.size());
		for(WebElement folan : allCompanies ) {
			System.out.println(folan.getText());
		}
		driver.quit();
		//table[@class="dataTable"]              : xpath of the whole webTable
		//table[@class="dataTable"]/tbody        : xpath of the amount in the webTable(header is excluded)
		//table[@class="dataTable"]/tbody/tr     : xpath of all the rows in table (header row was excluded previously)
		//table[@class="dataTable"]/tbody/tr/td  : xpath of all the data of table
		}}
