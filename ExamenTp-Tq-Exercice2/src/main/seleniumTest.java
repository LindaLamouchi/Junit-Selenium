package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class seleniumTest {

public   WebDriver driver;
	
	@Before 
	public void Init()
	{
		String chromeDriverPath = "C:\\Program Files (x86)\\Java\\chromDriver\\chromedriver_win32\\chromedriver.exe" ;
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		driver = new ChromeDriver(options);
		
		
	}
	
	@After 
	public void End() {
		driver.quit();
	}
	
	@Test 
	public void Script() {
		
		 driver.get("http://www.stb.com.tn/en/site/bourse-change/convertisseur-de-devises/"); 
		 driver.manage().window().maximize();
		 final Page page = new Page(driver) ;
		 Assert.assertEquals(30.632017385005433, page.Convertisseur(),0 );

	/*
		 Select devise1 = new Select(driver.findElement(By.id("devise-depart")));
		 devise1.selectByValue("EUR");
		 Select devise2 = new Select(driver.findElement(By.id("devise-arrivee")));
		 devise2.selectByValue("USD");
	
		 driver.findElement(By.id("result-depart")).clear();
		 driver.findElement(By.id("result-depart")).sendKeys("25") ;
		 driver.findElement(By.id("result-arrivee")).sendKeys(Keys.ENTER);
		 
		 
		//Recuperation des resultats !
		String res = driver.findElement(By.id("result-arrivee")).getAttribute("value") ;
		System.out.println(res); 
		double res2 = Double.parseDouble(res); 
		Assert.assertEquals(30.632017385005433, res2, 0 ); */
	}  

}
