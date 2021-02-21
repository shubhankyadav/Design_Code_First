package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generics.Generic_Common;
import pom.Login_Page;

public class Test_Login_Page extends Generic_Common {
 
//	public WebDriver driver; This must not be done coz its disturbs the flow of execution by the driver
	@Test
	public void login() throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 * driver= new ChromeDriver(); driver.get("http://localhost/login.do");
		 */
		Login_Page lp= new Login_Page(driver);
		lp.enter_un();
		
		lp.enter_pwd();
		
		lp.check_box();
		Thread.sleep(2000);
		lp.click_login_button();}

		 





}


