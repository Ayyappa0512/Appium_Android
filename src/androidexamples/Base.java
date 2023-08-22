package androidexamples;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String args[]) throws MalformedURLException 
	{
		File f= new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		System.out.println(fs.getAbsolutePath());
		
		DesiredCapabilities cap= new  DesiredCapabilities();
		
//		capabilities.setCapability("deviceName", "Samsung S4");
//	    capabilities.setCapability("platformName", "Android");
//	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
//	    capabilities.setCapability("platformVersion", "5.0.1");
		
		cap.setCapability("appium:deviceName", "Pixel_6a_API_27");
		cap.setCapability("appium:platformName", "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
	
		
		AndroidDriver  driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
		
		
		System.out.println("driver object created successfully");
		
		driver.findElement(MobileBy.AccessibilityId("aefagag"));
		
         
	}

}
