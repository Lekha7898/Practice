package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		
		WebDriver abc = new ChromeDriver();
		abc.get("https://www.facebook.com/");
		
		//type invalid email passwords
		abc.findElement(By.name("email")).sendKeys("holaqwerfgh@gmail.com");
		abc.findElement(By.name("pass")).sendKeys("hihola");
		//click login button
		abc.findElement(By.name("login")).click();
	}

}
