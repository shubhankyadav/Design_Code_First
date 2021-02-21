package Generics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_WebElement_Methods {

	public String get_the_attributes(WebElement ele,String att) {
		String attribute = ele.getAttribute(att);
		return attribute;
	}
	
	public Point get_location(WebElement ele) {
		Point loc = ele.getLocation();
		return loc;
	}
	
	public String get_the_text(WebElement ele) {
		String text = ele.getText();
		return text;
	}
	
	public boolean webelement_is_enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}
	
	public boolean webelement_is_selected(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}
	
	public boolean webelement_is_displayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}
	
}
