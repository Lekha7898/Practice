package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo {

	public static void main(String[] args) throws Exception {
		WebDriver abc = new ChromeDriver();
		abc.get("https://collegeweeklive.com/go-signup/");
		
		abc.manage().window().maximize();
		Thread.sleep(5000);
		
		//click submit button
		abc.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		//get the firstname error msg and print it in console
		System.out.println(abc.findElement(By.id("firstNameError")).getText());
		//String firsterrmsg = abc.findElement(By.id("FirstNameError")).getText();
		
		
	}

}
