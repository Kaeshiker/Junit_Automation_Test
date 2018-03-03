/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.gui_auto.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.gui_auto.base_classes.BaseElement;

public class PrivacyPolicy extends BasePage implements BaseElement {

	static Logger log = Logger.getLogger(PrivacyPolicy.class.getName());	 

	public PrivacyPolicy(WebDriver driver) {  
		super();  
		PropertyConfigurator.configure("config/log4j.properties");
		this._driver = driver;  
	}

	@Override
	public boolean onPage() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean waitForPage() {
		// TODO Auto-generated method stub
		return false;
	}  

}
