package com.jqueryui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SupportPage {
	
WebDriver driver;
	
	public SupportPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
	WebElement heading;
	
	
	public String getHeading(){
		return heading.getText();
	}
}
