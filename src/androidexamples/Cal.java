package androidexamples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Cal {
	
	public static void main(String args[]) throws MalformedURLException 
	{
		   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("appium:deviceName", "Pixel_6a_API_27");
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		    desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
		    desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723");

		    AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}
}
