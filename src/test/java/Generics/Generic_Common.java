package Generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public  class Generic_Common {
	public  WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	
	@Parameters("browsername")
	/*
	 * static {//It Executes before than @BM(Static Block)
	 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); }
	 */
	@BeforeMethod
	public  void Open_application(String browsername) throws FileNotFoundException, IOException {

System.out.println("Browser name is :" +browsername);
		
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		reports=new ExtentReports("./reports/r.html",false);
		test = reports.startTest("TESTING");



		//	   driver.get("http://localhost/login.do");
		String url = Generic_Property_File.property_data("./p.properties","url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void Close_application(ITestResult res) throws IOException {
		//		test.log(LogStatus.PASS,"TC are PASS");
		//		test.log(LogStatus.FAIL,"TC are FAILED");
		//		test.log(LogStatus.SKIP,"TC are SKIPPED");


		int status = res.getStatus();
		System.out.println(status);
		if(status==1) {

			String path = Generic_Screenshot.take_screenshot(driver);	
			test.log(LogStatus.PASS,"TC are PASED",test.addScreenCapture(path));
		}
		if(status==2) {

			String path = Generic_Screenshot.take_screenshot(driver);	
			test.log(LogStatus.FAIL,"TC are FAILED",test.addScreenCapture(path));
		}

		reports.endTest(test);
		reports.flush();


		driver.close();

	}}

