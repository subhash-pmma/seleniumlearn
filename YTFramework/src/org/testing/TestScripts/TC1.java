package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pmma\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void log() throws InterruptedException
	{
		
	 WebElement login = driver.findElementByXPath("//yt-formatted-string[text()='Sign in']");
		login.click();
		Thread.sleep(5000);
	WebElement email = driver.findElementByXPath("//input[@type='email']");
	email.sendKeys("envysion123@gmail.com");
	Thread.sleep(5000);
    WebElement next1 = driver.findElementByXPath("//span[text()='Next']");
	next1.click();
	Thread.sleep(5000);
	driver.findElementByXPath("//*[@type='password']").sendKeys("Subhash@123");;
	Thread.sleep(5000);
	WebElement next2 = driver.findElementByXPath("//span[text()='Next']");
	
	
	next2.click();
	Thread.sleep(5000);
	WebElement trend = driver.findElementByXPath("//yt-formatted-string[text()='Trending']");
	trend.click();
	Thread.sleep(5000);
	}
	@AfterMethod
	public void out() throws InterruptedException
	{
		WebElement out1=driver.findElementByXPath("//paper-item[@class='style-scope ytd-compact-link-renderer']");
		out1.click();
		Thread.sleep(5000);
		//driver.close();
	}
    
}
