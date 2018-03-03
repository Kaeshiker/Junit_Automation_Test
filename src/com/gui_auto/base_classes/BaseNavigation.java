/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.gui_auto.base_classes;

import java.util.List;

import org.openqa.selenium.WebElement;

/**
 * Purpose : Base abstract class for Navigation panels
 *
 */
public interface BaseNavigation {


	/**
	 * Should retrieve all clickable members
	 * @return List<WebElement> allElements
	 */
	abstract public List<WebElement> getAllElements();

	/**
	 * Should return only the selected link
	 * Which usually corresponds to the currently displayed page
	 * @return WebElement selected
	 */
	abstract public WebElement getSelectedElement();

	abstract public boolean isNavPresent();

	/**
	 * Locates the link by name, and clicks it
	 * @param elementName
	 * @return BaseElement page
	 */
	abstract public BaseElement clickElement(String elementName);

}
