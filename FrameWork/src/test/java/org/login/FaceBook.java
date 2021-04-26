package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monisha\\eclipse-workspace\\FrameWork\\lib\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtEmail = d.findElement(By.id("email"));
		txtEmail.sendKeys("amma@gmail.com");
		String Email=txtEmail.getAttribute("value");
		System.out.println(Email);
		WebElement txtPass = d.findElement(By.id("pass"));
		txtPass.sendKeys("ammananna");
		String pass=txtPass.getAttribute("value");
		System.out.println(pass);
		WebElement btnlogin = d.findElement(By.xpath("//button[@name ='login']"));
		btnlogin.click();
	}

}




















