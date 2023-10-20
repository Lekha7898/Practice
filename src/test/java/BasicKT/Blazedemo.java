package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
//		driver.get("https://blazedemo.com/purchase.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputName")).sendKeys("sree");
		driver.findElement(By.name("address")).sendKeys("asdfgh");
		driver.findElement(By.name("city")).sendKeys("erty");
		driver.findElement(By.name("state")).sendKeys("xcvbn");
		driver.findElement(By.name("zipCode")).sendKeys("4567");
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("Diner's Club");
		driver.findElement(By.name("creditCardNumber")).sendKeys("123456");
		driver.findElement(By.name("creditCardMonth")).sendKeys("12");
		driver.findElement(By.name("creditCardYear")).sendKeys("2034");
		driver.findElement(By.name("nameOnCard")).sendKeys("SREEDFGGH");
		driver.findElement(By.name("rememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).clear();
		driver.close();

	}

}
