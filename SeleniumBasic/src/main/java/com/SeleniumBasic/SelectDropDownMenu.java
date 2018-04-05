package com.SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMenu {

		static WebDriver driver;
		//@Test
		
		public static void VerifyDropDownMenu() throws InterruptedException {
			// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			
			
			 System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			Select select = new Select(driver.findElement(By.xpath("//*[@id='month']")));
			select.selectByVisibleText("Jan");
			
			select = new Select(driver.findElement(By.xpath("//*[@id='day']")));
			select.selectByIndex(9);
			
			select = new Select(driver.findElement(By.xpath("//*[@id='year']")));
			select.selectByValue("2014");		
				
			
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			//SelectDropDownMenu menu = new SelectDropDownMenu();
			VerifyDropDownMenu();
			
		} 
		
}
