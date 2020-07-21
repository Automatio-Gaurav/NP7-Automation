package com.AutomationTask.DemoProject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

    public static WebDriver driver;
    
    @BeforeMethod
	public void launchDriver()
	{
	 System.setProperty("webdriver.chrome.driver","E:\\chromDriver\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	 driver.manage().window().fullscreen();
//	 driver.manage().window().maximize();
	}
	
    @Test
	public void test1()
	{
//		driver.navigate().to("https://mail.google.com/mail/u/0/");
		driver.get("https://mail.google.com/mail/u/0/");
		System.out.println("The page title id :-"+driver.getTitle());
	}
/*	@Test
	public void test2()
	{
		try {
		driver.navigate().to("https://mail.google.com/mail/u/0/");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("onlygaurav7@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("CMD_prog123");
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
		Thread.sleep(3000);
		System.out.println("The page title id :-"+driver.getTitle());
		} catch (InterruptedException e) 
		{ e.printStackTrace();
		}
		
	}
	*/
	@Test
	public void test3()
	{
		driver.navigate().to("https://mail.google.com/mail/u/0/");
		System.out.println("The page title id :-"+driver.getTitle());	
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
