package P1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class mail1 {
	public WebDriver driver;
@BeforeTest
public void launchBrowser() {
	System.setProperty("webdriver.driver.chrome", "D:\\Selenium\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://google.com");
}	
	
	@Test
	public void takeScreenshot(String fileName) {
	//take screenshot and store in a file
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2 now copy the screenshot to desired location using copyfile method.
		
}
}
