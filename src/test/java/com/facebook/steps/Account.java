package com.facebook.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Account {
	
	static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	
	public void afterScenario() {
		driver.quit();
		}
	
	@Given("user to create new account")
	public void user_to_create_new_account() throws Exception {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	}

	@When("user name enter {string}")
	public void user_name_enter(String string) throws Exception {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(string,Keys.ENTER);
	}

	@When("user surname enter {string}")
	public void user_surname_enter(String string) throws Exception {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(string,Keys.ENTER);
	}

	@When("user mobile or email enter  {string}")
	public void user_mobile_or_email_enter(String string) throws Exception {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(string,Keys.ENTER);
	}

	@When("user password is enter {string}")
	public void user_password_is_enter(String string) throws Exception {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(string,Keys.ENTER);
	}
	
	@When("user age is enter {string}")
	public void user_age_is_enter(String string) throws Exception {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='birthday_age']")).sendKeys(string);
	}

	/*@When("user date of birth enter {string}")
	public void user_date_of_birth_enter(String string) throws Exception {
	    Thread.sleep(3000);
	    WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    Select s = new Select(date);
	    s.selectByValue(string);
	}

	@When("user date of month enter {string}")
	public void user_date_of_month_enter(String string) throws Exception {
	    Thread.sleep(3000);
	    WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select s1 = new Select(month);
	    s1.selectByValue(string);
	}

	@When("user date of year enter {string}")
	public void user_date_of_year_enter(String string) throws Exception {
	    Thread.sleep(3000);
	    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select s2 = new Select(year);
	    s2.selectByValue(string);
	}*/

	@When("user gender")
	public void user_gender() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

	@Then("sign up")
	public void sign_up() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	  
	}


}
	