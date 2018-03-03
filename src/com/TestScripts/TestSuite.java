/**
 * Framework - Hybrid Automation Selenium Testing
 * Version - 1.0
 * Creation Date - Feb, 2018
 * Author - Kaeshiker Jayasingh
 **/
package com.TestScripts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = {RegistrationTest.class,WriteAndDownloadTest.class})
public class TestSuite {
	

}
