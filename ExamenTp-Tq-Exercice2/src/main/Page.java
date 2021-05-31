package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page {
	
	@FindBy(id="devise-depart") 
	private Select devise_depart ;
	
	@FindBy(id="devise-arrivee") 
    private Select devise_arrivee ;
	
	@FindBy(id="result-depart") 
    private WebElement result_depart;
	
	@FindBy(id="result-arrivee") 
    private WebElement result_arrivee;
	
	private final WebDriver webDriver;
	
	//Field Constructor
	public Page(WebDriver webDriver) {
		 this.webDriver = webDriver;
		 PageFactory.initElements(webDriver,this);
	}   

    public  double Convertisseur(){
    	
    	devise_depart = new Select(webDriver.findElement(By.id("devise-depart")));
        devise_arrivee= new Select(webDriver.findElement(By.id("devise-arrivee")));
        devise_depart.selectByValue("EUR");
        devise_arrivee.selectByValue("USD");
        
        result_depart=webDriver.findElement(By.id("result-depart"));
        
        result_depart.clear();
        result_depart.sendKeys("25");
        result_arrivee.sendKeys(Keys.ENTER);
        
        String result = webDriver.findElement(By.id("result-arrivee")).getAttribute("value") ;
		System.out.println(result); //Affichage du resultat récuperé
		
        return  Double.parseDouble(result); 
    }
}
