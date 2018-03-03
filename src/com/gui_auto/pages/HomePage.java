/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.gui_auto.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.gui_auto.pages.BasePage;

public class HomePage extends BasePage{
	
	 static Logger log = Logger.getLogger(HomePage.class.getName());	 
	  
	    public HomePage(WebDriver driver) {  
	        super();  
	        PropertyConfigurator.configure("config/log4j.properties");
	        this._driver = driver;  
	    }  

}
