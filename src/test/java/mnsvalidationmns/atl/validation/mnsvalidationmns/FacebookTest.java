package mnsvalidationmns.atl.validation.mnsvalidationmns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\MIsc\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Facebook driver started");
	  
	  driver.get("https://facebook.com");
	  
	  driver.manage().window().maximize();
	  driver.quit();
	  
	  System.out.println("Facebook Execution completed");
	  
  }
}
