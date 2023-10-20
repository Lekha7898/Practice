package BasicKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment {

	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		drive.get("https://autotestdata.com/");
		drive.findElement(By.linkText("Need Help?")).click();
	}

}
