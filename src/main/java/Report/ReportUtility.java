package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Generic_Utilities.EnumKey;
import Generic_Utilities.ExtentReportPath;
import Generic_Utilities.GetDate;
import Generic_Utilities.PropertyFilePath;
import Generic_Utilities.Property_Utility;

public class ReportUtility
{
	
	ExtentReports report;
 
	public ReportUtility()
	{
		
	Property_Utility prop=new Property_Utility(PropertyFilePath.PROPERTYFILE_PATH);	
	
	String overRide = prop.getPropData(EnumKey.OVERRIDEREPORT);
	String randomName="";
	
	if(overRide.equalsIgnoreCase("no")) {
		randomName="_"+new GetDate().getcurrentDateTime();
	}
	
	ExtentSparkReporter spark=new ExtentSparkReporter(ExtentReportPath.
			REPORT_PATH+"extentreport"+randomName+" .html");
	spark.config().setDocumentTitle(prop.getPropData(EnumKey.REPORTTITLE));
	spark.config().setReportName(prop.getPropData(EnumKey.REPORTNAME));
	spark.config().setTheme(Theme.DARK);
	
    report=new ExtentReports();
	report.attachReporter(spark);	
	report.setSystemInfo("browser", prop.getPropData(EnumKey.BROWSERNAME));
	report.setSystemInfo("os",System.getProperty("os.name"));
	}
	
	 
	public void createTest(String name)
	{
	    ExtentTest	test = report.createTest(name);
	    UtilityListenerTransfer.setExtent(test);
	}
	
	public void info(String msg,ExtentTest test)
	{
		test.info(msg);
	}
	
	public void pass(String msg,ExtentTest test)
	{
		test.pass(msg);
	}
	public void fail(String msg,ExtentTest test)
	{
		test.fail(msg);
	}
	public void fail(Throwable msg,ExtentTest test)
	{
		test.fail(msg);
	}
	
	public void skip(Throwable msg,ExtentTest test)
	{
		test.skip(msg);
	}
	public void skip(String msg,ExtentTest test)
	{
		test.skip(msg);
	}
	public void warn(String msg,ExtentTest test)
	{
		test.warning(msg);
	}
	public void warn(Throwable msg,ExtentTest test)
	{
		test.skip(msg);
	}
	
	public void addScreenShot(String statergy,String title,String screenshotpath,ExtentTest test)
	{
		if(statergy.equalsIgnoreCase("base64"))
		{
			test.addScreenCaptureFromBase64String(screenshotpath, title);
		}
		else
		{
			test.addScreenCaptureFromPath(screenshotpath, title);
		}
	}
	public void addAuthor(ExtentTest test ,String... names )
	{
		test.assignAuthor(names);
	}
	public void addCategory(ExtentTest test ,String... names )
	{
		test.assignCategory(names);
	}
	public void save()
	{
		report.flush();
	}
}
