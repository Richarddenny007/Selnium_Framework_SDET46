package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpractice 
{
	@BeforeSuite
	public void suitSetup()
	{
	System.out.println("Before suit");	
	}
	@BeforeTest
	public void testSetup()
	{
	System.out.println("Before test");	
	}
	@BeforeClass
	public void classSetup()
	{
	System.out.println("Before class");	
	}
	@BeforeMethod
	public void methodSetup()
	{
	System.out.println("Before method");	
	}
	@Test
	public void test()
	{
	System.out.println("test");	
	}
	@AfterMethod
	public void methodTearDown()
	{
	System.out.println("After method");	
	}
	@AfterClass
	public void classTearDown()
	{
	System.out.println("After class");	
	}
	@AfterTest
	public void testTearDown()
	{
	System.out.println("After test");	
	}
	@AfterSuite
	public void suitTearDown()
	{
	System.out.println("After suit");	
	}

}
