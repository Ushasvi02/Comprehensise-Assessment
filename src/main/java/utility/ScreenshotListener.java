package utility;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reusablecomponents.base;

public class ScreenshotListener implements ITestListener {
	base b=new base();


	public void onTestFailure(ITestResult result) {
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			b.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	

