package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;

import Utilities.TakeScreenshot;

public class CustomListners implements ITestListener {


	public void onFinish(ITestContext arg0) {

	}

	public void onStart(ITestContext arg0) {

	}
	public void onTestFailedButWithinSuccessPertcentage(ITestContext arg0) {

	}
	public void onTestFailure(ITestContext arg0) throws IOException {
		
		TakeScreenshot.captureScreenshot();

	}
	public void onTestSkipped(ITestContext arg0) {

	}
	public void onTestStart(ITestContext arg0) {

	}
	public void onTestSuccess(ITestContext arg0) {

	}
}

