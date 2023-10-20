package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeFormCheckDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("firstname")).sendKeys("Sree");
//		Thread.sleep(2000);
//		driver.findElement(By.id("questions[q_135]")).click();
//		driver.findElement(By.id("questions[q_136]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Terms and Conditions")).click();
//		driver.close();
	}

}
