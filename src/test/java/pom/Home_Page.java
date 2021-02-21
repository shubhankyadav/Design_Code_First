package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.Generic_WebElement_Methods;

public class Home_Page {
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement help_button;
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement option;
	@FindBy(xpath="//tr[@class='productVersionInfo']/child::td[2]/child::span[1]")
	private WebElement actitime_version;
	@FindBy(xpath="//div[@id='aboutPopupCloseButtonId']")
	private WebElement close_btn;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	
	public Home_Page(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}
	
	public void click_help() {
		help_button.click();
	}
	public void click_option() {
		option.click();
	}

	/*
	 * public String handle_popup() { String text = actitime_version.getText();
	 * return text; }
	 *///No need of this method as its already defined in the generics 
	public void close_btn() {
		close_btn.click();
	}
	public void logout_btn() {
		logout.click();
	}
	
	public void print_Actitime_Version() {
		Generic_WebElement_Methods we = new Generic_WebElement_Methods();
		String text = we.get_the_text(actitime_version);
		//return text;
		System.out.println(text);
	}


}
