package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{
	public void openApplication() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\AUTOMATION\\drivers\\gekoDriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("applicaton opened");
	}
	public void closeApplication() 
	{
		driver.close();
		System.out.println("application closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
	public void enterFrame()
	{ 
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into Frame");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
	}
	public void addNewEmp()
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("Added New Emp");
		
	}
	

}
