package BasicKT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppleVacation_Count {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.applevacations.com/#!/");
		driver.manage().window().maximize();
		
    	driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/a")).click();
    	driver.findElement(By.linkText("Sign Up")).click();
// to print the count of the dropdown 
List<WebElement> count = 
	new Select(driver.findElement(By.name("ctl01$ContentPlaceHolder$account$txtState"))).getOptions();

	Thread.sleep(2000);
	System.out.println(count.size());

	//print dropdown valuesinto console for each loop
	for (WebElement abc : count) {
		System.out.println(abc.getText());
		
	}
	
	
	}

}
