package com.Selenium_Github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Percentage_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DUCAT\\Seleniam Automation\\Gmail Login\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Comment add 
		driver.manage().window().maximize();
		driver.navigate().to("http://www.calculator.net");
		driver.findElement(By.linkText("Math Calculators")).click();
		driver.findElement(By.linkText("Percentage Calculator")).click();
		driver.findElement(By.cssSelector("#cpar1")).sendKeys("50");
		driver.findElement(By.cssSelector("#cpar2")).sendKeys("5");
		driver.findElement(By.cssSelector("#content > table:nth-child(4) > tbody > tr:nth-child(2) > td > input[type='image']:nth-child(2)")).click();


	}

}
