package com.jqueryui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.jqueryui.pages.*;
import com.jqueryui.utils.CommonMethods;

public class BlogsPageTests extends CommonMethods{
	
	@Test
	public void validateDesignAndDev() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickDesign();
		Assert.assertEquals(blogsPageObj.getHeading(), "Category Archives: Design");
		blogsPageObj.clickDevelopment();
		Thread.sleep(4000);
		Assert.assertEquals(blogsPageObj.getHeading(), "Category Archives: Development");
		
	}
	
	@Test
	public void validateUnCategorizedTag() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickUncategorized();
		Thread.sleep(4000);
		Assert.assertEquals(themesPageObj.getHeading(), "Category Archives: Uncategorized");
	}
	
	@Test
	public void validateReleaseTag() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickReleasesTag();
		Thread.sleep(4000);
		Assert.assertEquals(themesPageObj.getHeading(), "Category Archives: Releases");
	}
	
	@Test
	public void validateRecentPost() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickRecentPostTag();
		Thread.sleep(4000);
		Assert.assertEquals(blogsPageObj.getHeading(), "jQuery UI 1.12.1");
	}
	
	@Test
	public void validateArchieves() throws Exception{
		homePageObj.clickBlogLink();
		blogsPageObj.clickArchives();
		Thread.sleep(4000);
		Assert.assertEquals(blogsPageObj.getHeading(), "Monthly Archives: December 2017");
	}
	
}
