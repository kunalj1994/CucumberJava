package Sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
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
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		element.sendKeys("Jharna");
		
	}
	
	@Then ("^User checks user first name is present$") 
		public void User_checks_user_first_name_is_present() {
 		String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("Jharna", userNameActual);
	}
	
	
	@And ("^User enters user last name$")
	public void User_enters_user_last_name() {
	driver.findElement(By.name("lastname")).sendKeys("Jain");
		
	}
	
	@But("^Mobile field should be blank$")
	public void Mobile_field_should_be_blank() {
		String mobileActual =  driver.findElement(By.name("reg_email__")).getAttribute("Value");
		Assert.assertEquals(mobileActual,"");
	}
	
}
