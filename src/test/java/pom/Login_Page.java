package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	@FindBy(id="username") 
	private WebElement un; 

	@FindBy(xpath="//input[@placeholder='Password']") 
	private WebElement pwd; 

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement cbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login_btn;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errmsg;
	
     public Login_Page(WebDriver driver) {
    	 PageFactory.initElements(driver,this);
     }
	
     public void enter_un() {
    	 un.sendKeys("admin");
     }
     
     public void enter_pwd() {
    	 pwd.sendKeys("manager");
     }

     public void click_login_button() {
    	 login_btn.click();
     }
     
     public void check_box() {
    	cbox.click(); 
     }
      public void verifyErrmsg() {
    	 boolean b = errmsg.isDisplayed();
    	 System.out.println(b);
      }


}

