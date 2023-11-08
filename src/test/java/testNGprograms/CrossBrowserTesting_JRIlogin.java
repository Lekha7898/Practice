package testNGprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting_JRIlogin {
	WebDriver driver;
	
	String BrowserName = "edge";
	
  @Parameters("BrowserName")
  @BeforeClass
   public void beforeClass(String BrowserName) {
	  if (BrowserName.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	} else if (BrowserName.equalsIgnoreCase("FireFox")) {
		driver = new FirefoxDriver();
	}else if (BrowserName.equalsIgnoreCase("HtmlUnit")) {
		driver = new HtmlUnitDriver();
	}else if (BrowserName.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	}else {
		System.out.println("please give a valid browser name..!");
	}
}

	
  @Test
  public void login() {
	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("txtUserName")).sendKeys("asdfg@gmail.com");
	  driver.findElement(By.name("txtPasswd")).sendKeys("123456");
  }

}
