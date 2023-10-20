package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) throws Exception {
		WebDriver Dri ;
		Dri = new ChromeDriver();	
		Dri.get("https://phptravels.com/demo/");
//		Dri.findElement(By.name("first_name")).sendKeys("sree");
//		Dri.findElement(By.name("last_name")).sendKeys("lekha");
//		Dri.findElement(By.name("business_name")).sendKeys("yolo");
//		Dri.findElement(By.name("email")).sendKeys("sdfgh@gmail.com");
		Thread.sleep(5000);
		Dri.findElement(By.xpath("//*[@id=\"mynavbar\"]/div/a[2]")).click();

	}

}
