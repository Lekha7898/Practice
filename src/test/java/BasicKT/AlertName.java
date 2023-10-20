package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertName {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//1st click me button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		
		//click on OK button on alert
		driver.switchTo().alert().accept();
		
		//click the 3rd button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		//click cancel button on confirmation
		driver.switchTo().alert().dismiss();

	}

}
