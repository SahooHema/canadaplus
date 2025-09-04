package Hooks;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.qa.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks extends Base{	
	
//	@Before(order=0)
//	public void openBrowser() {
//		Base.initialization();
//	}
	
	@After(order=0)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
		String screenshot=	scenario.getName();
		byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", screenshot);
		}
	}
}
//note:important for interview}

@Before
public void exit() {
	System.out.println();
}