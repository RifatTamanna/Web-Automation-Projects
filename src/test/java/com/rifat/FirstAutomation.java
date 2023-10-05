package com.rifat;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	String url = "https://www.selenium.dev/";
	@Test
	public void openUrl() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Support')]")).click();
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Documentation')]")).click();
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
		Thread.sleep(10000);//1000ms = 1s
		
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		Thread.sleep(10000);//1000ms = 1s
		
	}
}
