package seleniumPackage;
import org.testng.annotations.*;
public class TestNG2 {
		@BeforeTest
	public void a() {
		System.out.println("Check URL is woking or not");
	}
		@Test
	public void b() {
		System.out.println("Login Test Case");
	}
		@Test
	public void c() {
		System.out.println("Dashboard TestCase");
	}
		@BeforeSuite
	public void d() {
		System.out.println("Hello annotation before suite");
	}
}
