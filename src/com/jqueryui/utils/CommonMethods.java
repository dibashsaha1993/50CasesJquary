package com.jqueryui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.jqueryui.pages.*;

public class CommonMethods {
	
	public WebDriver driver;
	
	public HomePage homePageObj;
	public DemoPage demoPageObj;
	public DevelopmentPage developmentPageObj;
	public BlogsPage blogsPageObj;
	public DocumentPage documentPageObj;
	public DownloadPage downloadPageObj;
	public SupportPage supportPageObj;
	public ThemesPage themesPageObj;
	public CookbookPage cookbookPageObj;
	public JqueryNavPage jqueryNavPagePageObj;
	public ContributePage contributePageObj;

	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "DriverDirectory/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		homePageObj = new HomePage(driver);
		demoPageObj = new DemoPage(driver);
		developmentPageObj = new DevelopmentPage(driver);
		cookbookPageObj = new CookbookPage(driver);
		blogsPageObj = new BlogsPage(driver);
		documentPageObj = new DocumentPage(driver);
		downloadPageObj = new DownloadPage(driver);
		supportPageObj = new SupportPage(driver);
		themesPageObj = new ThemesPage(driver);
		jqueryNavPagePageObj = new JqueryNavPage(driver);
		contributePageObj = new ContributePage(driver);
		
		
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown(){
		driver.quit();	
	}

}
