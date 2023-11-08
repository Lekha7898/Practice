package testNGprograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class JustRechargeitLogin {
  @Test
  public void login() throws Exception {
	  WebDriver driver = new ChromeDriver();
//	  WebDriver driver = new FirefoxDriver();
//	  WebDriver driver = new EdgeDriver();
//    Headless browser : use "HTMLUnit driver" dependicies in POM.xml file
//	  WebDriver driver = new HtmlUnitDriver();
	 
	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("txtUserName")).sendKeys("asdfg@gmail.com");
	  driver.findElement(By.name("txtPasswd")).sendKeys("123456");
	  
	  //use scanner to read the value from the console
	  Scanner s = new Scanner(System.in);
	  String captcheNum = s.next();
	  Thread.sleep(3000);
	  driver.findElement(By.name("txtCaptcha")).sendKeys(captcheNum);
	  
	  driver.quit();
	  
  }
}
