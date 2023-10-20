package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeItGetText {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("imgbtnSignin")).click();
		System.out.println(driver.findElement(By.id("MessageCaption2")).getText());
		
		

	}

}
