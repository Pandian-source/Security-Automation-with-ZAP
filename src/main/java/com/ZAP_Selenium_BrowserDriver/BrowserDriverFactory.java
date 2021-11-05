package com.ZAP_Selenium_BrowserDriver;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserDriverFactory
{

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static WebDriver createChromeDriver(Proxy proxy, String path)
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();

		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pandiyan\\eclipse-workspace\\ZAPSeleniumIntegration\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(cap);

		System.out.println(driver);

		cap.setCapability("proxy", proxy);

		return driver;






	}
}