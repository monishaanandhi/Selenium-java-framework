package org.login;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelWrite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monisha\\eclipse-workspace\\FaceBook\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
String title = d.getTitle();
System.out.println(title);
String currentUrl = d.getCurrentUrl();
	System.out.println(currentUrl);
WebElement element = d.findElement(By.id("countries"));
Select s  = new Select(element);
List<WebElement> options = s.getOptions();
 for (int i = 0; i <options.size(); i++) {
	WebElement webElement = options.get(i);
	String text = webElement.getText();
	System.out.println(text);
}
	}

}
