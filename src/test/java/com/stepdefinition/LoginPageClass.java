package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageClass {
	static WebDriver driver;

	@Given("user launch browser and in FB page")
	public void user_launch_browser_and_in_FB_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prabha\\eclipse-workspace\\Xpath\\drive\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {

		driver.findElement(By.id("email")).sendKeys("12345");
		driver.findElement(By.id("pass")).sendKeys("12345");

	}

	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("user has to navigate to invalid credentials page")
	public void user_has_to_navigate_to_invalid_credentials_page() {
		System.out.println("login verified");
	}

}
