package com.jqueryui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class JqueryNavPage {
	
WebDriver driver;
	
	public JqueryNavPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1")
	WebElement heading;
	

	@FindBy(linkText="jQuery")
	WebElement jqueryLink;
	

	@FindBy(linkText="jQuery UI")
	WebElement jqueryUILink;
	

	@FindBy(linkText="jQuery Mobile")
	WebElement jqueryMobileLink;
	

	@FindBy(linkText="QUnit")
	WebElement qUnitLink;
	

	@FindBy(linkText="Sizzle")
	WebElement sizzleLink;
	
	
	public void clickSizzleIcon(){
		sizzleLink.click();
	}
	
	public void clickQunitIcon(){
		qUnitLink.click();
	}
	
	public void clickJqueryMobileIcon(){
		jqueryMobileLink.click();
	}
	
	public void clickJqueryUIIcon(){
		jqueryUILink.click();
	}
	
	
	public void clickJqueryIcon(){
		jqueryLink.click();
	}
	
	public String getHeading(){
		return heading.getText();
	}
}
