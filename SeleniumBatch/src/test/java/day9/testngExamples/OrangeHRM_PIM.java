package day9.testngExamples;

import org.testng.annotations.Test;

import day2.ObjectIdentification.SeleniumUtility;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class OrangeHRM_PIM extends SeleniumUtility {
  @Test
  public void testPIM_Creation() 
  {
		
  }
  @Test
	public void testPIM_Update() 
  {
  
  }
  @Test
	public void testPIM_Delete()
    {
		
		
	}
	
}
/*
 * Validation: should be done using Assert class
 * 
 * 		Assert.assertEquals(arg1, arg2);
 * 		Assert.assertEquals(arg1, arg2, msg);
 * 
 * 		Assert.assertTrue(condition);
 * 		Assert.assertTrue(condition,msg);
 * 
 * 		Assert.assertFalse(condition);
 * 		Assert.assertFalse(condition,msg);
 */