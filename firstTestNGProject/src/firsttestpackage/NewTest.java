package firsttestpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testing\\Desktop\\Aarti\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
  }
  @Test  
  public void test1()                      // First test case.  
{  
  System.out.println("test1");   
}   
@Test  
 public  void test2()                     // Second test case.  
{  
System.out.println("test2");  
}
}
