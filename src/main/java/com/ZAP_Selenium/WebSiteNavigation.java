package com.ZAP_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebSiteNavigation
{

	WebDriver driver;

	final static String BASE_URL = "https://itera-qa.azurewebsites.net";

	final static String LOGOUT_URL = "https://itera-qa.azurewebsites.net/Login/LogOut";

	final static String Firstname = "Rajan";

	final static String Surname = "Muthu";

	final static String USERNAME = "------____@gmail.com";

	final static String PASSWORD = "hiU@zZ3pJAnTj4D";

	final static String CONFIRMPASSWORD = "hiU@zZ3pJAnTj4D";


	public WebSiteNavigation(WebDriver driver)

	{
		this.driver = driver;

		driver.manage().window().maximize();

		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		this.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	public void navigateBeforeLogin()

	{
		driver.get(BASE_URL);

		driver.findElement(By.xpath("//a[@href='/UserRegister/NewUser']")).click();

		this.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	public void registerNewUser()

	{
		driver.get(BASE_URL+"/UserRegister/NewUser");

		driver.findElement(By.xpath("//input[@id='FirstName']")).clear();

		driver.findElement(By.xpath("//input[@id='FirstName']")).click();

		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(USERNAME);


		driver.findElement(By.xpath("//input[@id='Surname']")).clear();

		driver.findElement(By.xpath("//input[@id='Surname']")).click();

		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys(Surname);


		driver.findElement(By.xpath("//input[@id='Username']")).clear();

		driver.findElement(By.xpath("//input[@id='Username']")).click();

		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(USERNAME);


		driver.findElement(By.xpath("//input[@id='Password']")).clear();

		driver.findElement(By.xpath("//input[@id='Password']")).click();

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PASSWORD);


		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();

		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();

		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(CONFIRMPASSWORD);

		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

	public void loginAsUser()

	{
		driver.get(BASE_URL+"/Login");

		driver.findElement(By.xpath("//input[@id='Username']")).clear();

		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(USERNAME);

		driver.findElement(By.xpath("//input[@id='Password']")).clear();

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PASSWORD);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public void verifyPresenceOfText(String text) {

		String pageSource = this.driver.getPageSource();

		System.out.println(pageSource);

	}

	public void navigateAfterLogin()
	{
		driver.findElement(By.xpath("//input[@id='searching']")).click();

		driver.findElement(By.xpath("//a[@href='/Login/LogOut']")).click();
	}
}