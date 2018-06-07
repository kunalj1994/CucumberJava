package Sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Myfirststepdef {
	
	WebDriver driver;
	
	@Given("^User is at facebook login page$")
	public void User_is_at_facebook_login_page(){
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}

	@When ("^User enters user first name$")
	public void User_enters_user_first_name() {
		driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).sendKeys("Jharna");
			}
	
	@Then ("^User checks user first name is present$") 
		public void User_checks_user_first_name_is_present() {
		String userNameActual = driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).getAttribute("value");
		Assert.assertEquals("Jharna", userNameActual);
	}
	
	
}
