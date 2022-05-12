package Utlities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.ox.base.LRBase;

public class TakeScreenshot extends LRBase {
	
	@Test
	public static void captureScreenshot() throws IOException {
		
	File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\Scr.jpg"));
		
	}

}
