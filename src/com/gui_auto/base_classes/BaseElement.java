/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.gui_auto.base_classes;

import org.openqa.selenium.NoSuchElementException;

public interface BaseElement {

	abstract public boolean onPage() throws NoSuchElementException; // webdriver calls to determine if this is the page.

	/**
	 * Should implement only this line
	 * 
	 * GUI_automation_base.waitToLoad(10, this);
	 * 
	 * @return
	 */
	abstract public boolean waitForPage();

}
