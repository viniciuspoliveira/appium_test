package lavoscracker.appiumaula;

import java.net.MalformedURLException;
import java.net.URI;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(null)
		
		
	AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), null);
	
	//Actual Automation
		
	}

}
