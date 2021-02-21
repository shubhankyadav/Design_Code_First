package Generics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Dropdowns {
	Select s;
	public Generic_Dropdowns(WebElement ele) {
		s=new Select(ele);
	}
	

	
	public boolean dropdown_type(WebElement ele) {
		
		boolean b = s.isMultiple();
		return b;
			}
	
	public void select_by_index(WebElement ele,int i) {
	
		  s.selectByIndex(i);}
	
	public void select_by_visible_text(WebElement ele,String text) {
	
		s.selectByVisibleText(text);
	}
	
	public void select_by_value(WebElement ele,String value) {
		
		s.deselectByValue(value);
	}
	
	public void deselect_by_index(WebElement ele,int i) {
		
		  s.deselectByIndex(i);}
	
	public void deselect_by_visible_text(WebElement ele,String text) {
	
		s.deselectByVisibleText(text);
	}
	public void deselect_by_value(WebElement ele,String value) {
	
		s.selectByValue(value);}
	public void deselect_all(WebElement ele,String value) {
		
		s.deselectAll();
	}	
	public List<WebElement> get_count(WebElement ele) {
		
		List<WebElement> count = s.getOptions();
		return count;
	}
	
	public List<WebElement> get_selected_count(WebElement ele) {
		
		List<WebElement> count = s.getAllSelectedOptions();
		return count;
	}		
	}
	

