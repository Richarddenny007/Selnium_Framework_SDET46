package Report;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base_Class.ConfigurationClass1;

public class ExtentReportListner implements ITestListener,ISuiteListener
{
	public static ReportUtility sreport;
	private ReportUtility report;
	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart---suite");
		report=new ReportUtility();
		sreport=report;
	
	}


	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("onTestStart");
		report.createTest(result.getMethod().getMethodName());
		ExtentReport annotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(ExtentReport.class);
		report.addAuthor(UtilityListenerTransfer.getExtent(), annotation.author());
		report.addCategory(UtilityListenerTransfer.getExtent(), annotation.category());
		
	}
	

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("onTestSuccess---test");
		report.pass(result.getMethod().getMethodName()+" pass", UtilityListenerTransfer.getExtent());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		report.fail(result.getMethod().getMethodName()+" fail",UtilityListenerTransfer.getExtent());
		report.fail(result.getThrowable(),UtilityListenerTransfer.getExtent());

		report.addScreenShot("base64", result.getMethod().getMethodName(), 
				ConfigurationClass1.class.cast(result.getInstance()).sel.getScreenShot(),UtilityListenerTransfer.getExtent());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		report.skip(result.getMethod().getMethodName()+" skip",UtilityListenerTransfer.getExtent());
		report.skip(result.getThrowable(),UtilityListenerTransfer.getExtent());
		report.addScreenShot("base64", result.getMethod().getMethodName(), 
				ConfigurationClass1.class.cast(result.getInstance()).sel.getScreenShot(),UtilityListenerTransfer.getExtent());	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}


	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish--test");
	}
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish---suite");
		report.save();
	}
}
