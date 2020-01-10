package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch4()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pmma\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void log4() throws InterruptedException
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
	WebElement img1=driver.findElementByXPath("//img[@id='img' ][@class='style-scope yt-img-shadow']");
	img1.click();
	Thread.sleep(2000);
	WebElement creat=driver.findElementByXPath("//yt-formatted-string[@*='label'][text()='Create a channel']");
	creat.click();
	Thread.sleep(2000);
	WebElement getstart= driver.findElementByXPath("//yt-formatted-string[text()='Get started']");
	getstart.click();
	Thread.sleep(2000);
	WebElement subhas= driver.findElementByXPath("//yt-formatted-string[text()='Select']");
	subhas.click();
	Thread.sleep(2000);
	WebElement des = driver.findElementByXPath("//div[@id='section-label'][@class='style-scope ytcp-form-textarea']");
	des.sendKeys("i love automation");
	Thread.sleep(2000);
	WebElement save = driver.findElementByXPath("//div[text()='Save and continue']");
	save.click();
	Thread.sleep(2000);
	}
	@AfterMethod
	public void out4() throws InterruptedException
	{
		
		driver.findElementByXPath("//img[@id='img'][@class='style-scope yt-img-shadow']").click();//
		Thread.sleep(2000);
		WebElement out1=driver.findElementByXPath("//yt-formatted-string[text()='Sign out']");
		out1.click();
		Thread.sleep(2000);
		driver.close();
	}
    
}
