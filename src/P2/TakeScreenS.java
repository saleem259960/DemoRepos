package P2;

import java.io.File;
import java.io.InputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

public class TakeScreenS {
	public static WebDriver driver;
	public static void main(String[] args) {
		TakeScreenS.launchBrowser();
	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	public static void takeScreenShot(String ssname) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		
		
	}
	

}
