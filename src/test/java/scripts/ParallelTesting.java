package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
   public WebDriver driver;
	@Test
	public void Test1() {
		System.out.println("test1 | "+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	
	}

	@Test
	public void Test2() {
		System.out.println("test2 | "+Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
	
	}
}
