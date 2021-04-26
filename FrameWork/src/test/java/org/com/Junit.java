package org.com;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
@BeforeClass
public static void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\monisha\\eclipse-workspace\\FrameWork\\lib\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
}
	@AfterClass
	public static void afterClass() {
driver.quit();
	}
	@Before
	public void beforemethod() {
Date date = new Date();
System.out.println(date);
	}
	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void testMethod() throws InterruptedException {
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("welcome to adactin");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("adactin hotel *****");
		Thread.sleep(20000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
