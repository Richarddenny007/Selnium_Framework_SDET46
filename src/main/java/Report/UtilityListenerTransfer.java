package Report;

import com.aventstack.extentreports.ExtentTest;

public class UtilityListenerTransfer {

	private  static ThreadLocal<ExtentTest> extent=new ThreadLocal<>();

	public static ExtentTest getExtent() {
		return extent.get();
	}

	public static void setExtent(ExtentTest setextent) {
		extent.set(setextent);
	}
	
}

