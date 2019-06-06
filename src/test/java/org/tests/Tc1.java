package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc1 {
	WebDriver driver;
	
	@Test
	public void tc1(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
