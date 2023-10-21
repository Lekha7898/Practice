package BasicKT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropdownValues {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//List:advanced version of Array
	List<WebElement> dropdownoptions = 
			new Select(driver.findElement(By.id("country"))).getOptions();
		Thread.sleep(3000);
		
		//how many countries ar there
		System.out.println(dropdownoptions.size());
		
		List<WebElement> MonthValues = 
				new Select(driver.findElement(By.id("questions_16_Month"))).getOptions();

		System.out.println("Month dropdown count is:" +MonthValues.size());
	}

}
