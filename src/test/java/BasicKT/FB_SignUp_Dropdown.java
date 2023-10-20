package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp_Dropdown {

	public static void main(String[] args) throws Exception {
		WebDriver abc = new ChromeDriver();
		abc.get("https://www.facebook.com/");
		//manage to maximize the wondow
		abc.manage().window().maximize();
		//wait for 5 sec
		Thread.sleep(5000);
		abc.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(5000);
	    
	    //Dropdown 
	    new Select(abc.findElement(By.id("day"))).selectByVisibleText("7");
	    new Select(abc.findElement(By.id("month"))).selectByVisibleText("Aug");
	    new Select(abc.findElement(By.id("year"))).selectByVisibleText("2015");
	    
	    Thread.sleep(5000);
	    abc.close();

	}

}
