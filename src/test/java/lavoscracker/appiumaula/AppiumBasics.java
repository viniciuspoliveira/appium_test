package lavoscracker.appiumaula;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {


	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException
	{
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("PixelProduction");
		options.setApp("//Users//viniciusoliveira//eclipse-workspace//appiumaula//src//test//java//resources//ApiDemos-debug.apk");
		
		
	AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	driver.quit();
	
	//Actual Automation
		
	}

}
