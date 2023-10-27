package jri_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAnAccount_TS01 {
	//create webdriver object variable
	WebDriver driver;
	
  @Test
  public void tc_001() {
//	  1.open chrome browser
//	  2.type the URL mentioned in the input section
//	  3.click on enter key
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.justrechargeit.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  //verify the create new object is displayed or not on webpage?
	  WebElement createnewacc = driver.findElement(By.linkText("Create New Account"));
	  if(createnewacc.isDisplayed()) {
		  System.out.println("create new account object has displayed");
	  }else {
		  System.out.println("create new account object is not displayed");
	  }
	  System.out.println("test case 001 passed!");
	  
	  //driver.close();
	  driver.quit();
  
    }
  
  @Test
  public void tc_002() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.justrechargeit.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  //click on create new acc
	  WebElement createnewacc = driver.findElement(By.linkText("Create New Account"));
	  createnewacc.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  //get the current page URL
	  String signinpageURL = driver.getCurrentUrl();
	  System.out.println(signinpageURL);
	  //System.out.println(driver.getCurrentUrl());
	  //if(actualresults.equal(expected results))
	  if(signinpageURL.equals("https://www.justrechargeit.com/SignUp.aspx")) {
		  System.out.println("Test case 002 is passed!");
	  }else {
		  System.out.println("Test case 002 is failed, please check tge URL");
	  }
	  
	  //System.out.println("test case 002 passed!");
	  
	  driver.quit();
  
    }
  
}
