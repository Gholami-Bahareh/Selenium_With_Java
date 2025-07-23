package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {

	public static void main(String[] args) {
		// lunch the Google Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\213\\0 Real world Real job!\\Matherial for QA\\Java Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//what is above : location adress of Chrome driver
		WebDriver driver = new ChromeDriver();
		//control a .. control shift o => will import the needed ones
		driver.get("https://www.google.com/");
		
		

	}

}
