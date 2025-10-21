package seleniumPackage;
import org.testng.annotations.*;
public class TestNG4 {
	@Test (priority = 0)
	public void z() {
		System.out.println("zzz0");	}
	@Test (priority = 1)
	public void k() {
		System.out.println("kkk1");	}
	@Test (priority = 2)
	public void x() {
		System.out.println("xxx2");	}
	@Test (priority=-1)
	public void d() {
		System.out.println("ddd-1");	}
	@Test 
	public void r() {
		System.out.println("rrr"); 	}
	@Test (enabled = false )
	public void w() {
		System.out.println("www- disable");  }
	@Test 
	public void n() {
		System.out.println("nnn");  }
	@Test (priority=-2)
	public void y() {
		System.out.println("yyy-2");	}
}