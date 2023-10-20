package BasicKT;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
//get the system date and time
		Date d = new Date();
		//customised : yyyy-mm-dd_HH:mm:ss
		DateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
		//convert the system format to user defined format
	String timestamp = df.format(d);		
		
		
		//screenshot path
		//String path = ".\\Screenshots\\";	
		
		//take screenshot of current browser/window
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//move it to specific folder
		//FileHandler.copy(abc, new File(path+"test.PNG"));
		FileHandler.copy(abc, new File(".\\Screenshots\\testname"+timestamp+".PNG"));
//		FileHandler.copy(abc, new File(".\\Screenshots\\testname.PNG"));
//		driver.close();
		
	}

}
