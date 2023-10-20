package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws Exception {
		WebDriver abc = new ChromeDriver();
		abc.get("https://www.facebook.com/");
		Thread.sleep(3000);
		abc.findElement(By.partialLinkText("ord?")).click();
		Thread.sleep(3000);
		//click for back arrow
		abc.navigate().back();
		Thread.sleep(3000);
		
		//forward the page 
		abc.navigate().forward();
		abc.findElement(By.name("email")).sendKeys("navigatyui");
		Thread.sleep(3000);
		
		//refresh page
		abc.navigate().refresh();

	}

}
