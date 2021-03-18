package com.src.main;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class PageObject {
	 private final WebDriver webDriver;
	    @FindBy(id = "cookie_tout_accepter_1")
	    private WebElement cookie;
	    @FindBy(id = "sept")
	    private WebElement sept;
	    @FindBy(id = "addition")
	    private WebElement addition;
	    @FindBy(id = "huit")
	    private WebElement huit;
	    @FindBy(id = "egale")
	    private WebElement egale;
	    @FindBy(id = "total")
	    private WebElement total;

	    public PageObject(WebDriver webDriver) {
	        this.webDriver=webDriver;
	        PageFactory.initElements(webDriver,this);
	    }
	    public String performCalculation(){
	        cookie.click();
	        sept.click();
	        addition.click();
	        huit.click();
	        egale.click();
	        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
	        try {
	            Files.copy(screenshot,new File("test.png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return total.getText();
	    }
	

	}


