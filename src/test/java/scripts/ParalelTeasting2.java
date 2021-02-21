package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalelTeasting2 {

	public WebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void Test1(String browsername) {
		System.out.println("Browser name is :" +browsername);
		
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		
		
	
	}
	
	@Test
	public void openapp() {
		driver.get("https://www.google.com");
	}
}
