package com.main.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import junit.framework.Assert;

class TestCalculator {
/*	//private WebElement btn7,btn8,btnEq,btnPlus,btnC;
	private WebDriver driver;
	@BeforeEach
	void installWeb() {
		String chromeDriverPath = "C:\\Program Files (x86)\\Java\\chromDriver\\chromedriver_win32\\chromedriver.exe" ;

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
 
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

		driver = new ChromeDriver(options);
		
		
	}
	@AfterEach 
	void DriverClse() {
		if(driver!=null)
		driver.quit();
		
	}
	@Test
	void test() {
		//Page page=new Page(driver);
		//page.getW
		driver.get("https://www.ma-calculatrice.fr/");
		driver.findElement(By.id("cookie_tout_accepter_1")).click();
		//btn7 = driver.findElement(By.id("sept"));
		//btn7.click();
		driver.findElement(By.id("addition")).click();
		driver.findElement(By.id("huit")).click();
		driver.findElement(By.id("egale")).click();
		
		String s = driver.findElement(By.id("total")).getText() ;
		
		Assert.assertEquals(s, "15");

	}
*/
}
