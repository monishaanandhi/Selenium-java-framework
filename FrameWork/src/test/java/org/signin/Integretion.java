package org.signin;

import java.sql.Driver;

import org.com.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Integretion extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	BaseClass b= new BaseClass();
	b.getDriver();
	b.launchUrl("https://www.facebook.com/");
//	b.enterText("Java",driver.findElement(By.id("email")));
//	b.enterText("password", driver.findElement(By.id("pass")));
	
	
//	WebElement id = b.findElementByID("email");
//	b.enterText("java", id);
//	WebElement id2 = b.findElementByID("pass");
//	b.enterText("pass", id2);
////	WebElement name = b.findElementByName("login");
////	b.btnClick(name);

//	WebElement path = b.findElementByXpath("//h2[@class='_8eso']");
//	WebElement id = b.findElementByID("email");
	Thread.sleep(3000);
	
	b.dragAndDrop(b.findElementByXpath("//h2[@class='_8eso']"), b.findElementByID("email"));
	
}
}
