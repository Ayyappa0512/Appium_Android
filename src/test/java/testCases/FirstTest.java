package testCases;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class FirstTest {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:deviceName", "Pixel_6a_API_27");
		caps.setCapability("appium:platformName", "Android");
		caps.setCapability("appium:platformName", "8.1.0");
		caps.setCapability("appium:automationName", "uiautomator2");
		caps.setCapability("appium:app", System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk");


		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"), caps);

		driver.findElement(MobileBy.AccessibilityId("Access'ibility")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
