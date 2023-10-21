package BasicKT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollageweekDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(3000);
		
		//click on major of interest multiple select box
		
		//click on element
		driver.findElement(By.id("questions[q_19]")).click();
		Thread.sleep(2000);
		
		//click on multiple options(choose multiple check boxes)
		Random r = new Random();
		
		//min num is 0 and max is 43
		//option is the number we get as random slected number through program
		int option1 = r.nextInt(43);
		System.out.println("random num1 is :" + option1);
		driver.findElement(By.id("questions[q_19]["+option1+"]")).click();
		Thread.sleep(2000);
		
		int option2 = r.nextInt(43);
		System.out.println("random num2 is :" + option2);
		driver.findElement(By.id("questions[q_19]["+option2+"]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.id("questions[q_19][3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("questions[q_19][11]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("questions[q_19][18]")).click();
//		Thread.sleep(2000);
		
		//click on same element again
		driver.findElement(By.id("questions[q_19]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
