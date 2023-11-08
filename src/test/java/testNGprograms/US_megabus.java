package testNGprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class US_megabus {
  @Test
  public void f() {
	  WebDriver driver =  new ChromeDriver();
	  driver.get("https://us.megabus.com/account-management/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //click on signup page
	  driver.findElement(By.xpath("/html/body/main/div/mb-app/mb-login-page/div/div/div/ul/li[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  //type invalid test data
	  driver.findElement(By.id("email")).sendKeys("test98765@gmail.com");
	  driver.findElement(By.id("confirmEmail")).sendKeys("test98765@gmail.com");
	  driver.findElement(By.id("choosePassword")).sendKeys("test@98765");
	  driver.findElement(By.id("confirmPassword")).sendKeys("test@98765");
	  
	  //webdriver click is not working here,so we will use java script click method to proceed
	  //driver.findElement(By.id("termsAndPrivacy")).click();
	  WebElement termscheckbox = driver.findElement(By.id("termsAndPrivacy"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();", termscheckbox);
	 
	  //driver.findElement(By.id("marketing")).click();
	  WebElement secondcheckbox = driver.findElement(By.id("marketing"));
	  js.executeScript("arguments[0].click();", secondcheckbox);
	  
	  //check the signup button is enabled state, if it is disable state we have to wait until that comes to enable state
	  //use webdriverwait to check the condition
	  WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(30));
	  ww.until(ExpectedConditions.elementToBeClickable(By.id("signup")));
	  
	  driver.findElement(By.id("signup")).click();
  }
}
