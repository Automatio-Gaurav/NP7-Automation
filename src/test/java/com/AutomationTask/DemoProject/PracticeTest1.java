package com.AutomationTask.DemoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest1 {
	 public static WebDriver driver;
	 
	public static void main(String[] args)
	{
	 System.setProperty("webdriver.chrome.driver","E:\\chromDriver\\chromedriver.exe");
	 try {
//			driver.navigate().to("https://mail.google.com/mail/u/0/");
		     System.setProperty("webdriver.chrome.driver","E:\\chromDriver\\chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.get("https://mail.google.com/mail/u/0/");
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("onlygaurav7@gmail.com");
			driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")).click();
			driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("CMD_prog123");
			driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
			Thread.sleep(3000);
			System.out.println("The page title id :-"+driver.getTitle());
			} catch (InterruptedException e) 
			{ e.printStackTrace();
			}
	 System.out.println("The page title id :-"+driver.getTitle());	

	}

}
