package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch3()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pmma\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void log3() throws InterruptedException
	{
		
	 WebElement login = driver.findElementByXPath("//yt-formatted-string[text()='Sign in']");
		login.click();
		Thread.sleep(2000);
	WebElement email = driver.findElementByXPath("//input[@type='email']");
	email.sendKeys("envysion123@gmail.com");
	Thread.sleep(2000);
    WebElement next1 = driver.findElementByXPath("//span[text()='Next']");
	next1.click();
	Thread.sleep(2000);
	driver.findElementByXPath("//*[@type='password']").sendKeys("Subhash@123");;
	Thread.sleep(2000);
	WebElement next2 = driver.findElementByXPath("//span[text()='Next']");
	
	
	next2.click();
	Thread.sleep(2000);
	WebElement vid = driver.findElementByXPath("//yt-formatted-string[@id='video-title'][@class='style-scope ytd-rich-grid-video-renderer']");
	vid.click();
	Thread.sleep(2000);
	
	WebElement like=driver.findElementByXPath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']");
	like.click();
	}
	@AfterMethod
	public void out3() throws InterruptedException
	{
		
		driver.findElementByXPath("//img[@id='img'][@class='style-scope yt-img-shadow']").click();
		Thread.sleep(2000);
		WebElement out1=driver.findElementByXPath("//yt-formatted-string[text()='Sign out']");
		out1.click();
		Thread.sleep(2000);
		driver.close();
	}
    
}
