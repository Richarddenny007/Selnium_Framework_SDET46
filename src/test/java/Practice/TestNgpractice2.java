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

public class TestNgpractice2
{
	@BeforeSuite
	public void suitSetup()
	{
	System.out.println("Before suit1");	
	}
	@BeforeTest
	public void testSetup()
	{
	System.out.println("Before test1");	
	}
	@BeforeClass
	public void classSetup()
	{
	System.out.println("Before class1");	
	}
	@BeforeMethod
	public void methodSetup()
	{
	System.out.println("Before method1");	
	}
	@Test
	public void test()
	{
	System.out.println("test1");	
	}
	@AfterMethod
	public void methodTearDown()
	{
	System.out.println("After method1");	
	}
	@AfterClass
	public void classTearDown()
	{
	System.out.println("After class1");	
	}
	@AfterTest
	public void testTearDown()
	{
	System.out.println("After test1");	
	}
	@AfterSuite
	public void suitTearDown()
	{
	System.out.println("After suit1");	
	}

}
