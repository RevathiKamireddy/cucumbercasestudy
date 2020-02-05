package cucumberC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy2 {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chrome_driver\\chromedrivers\\chromedriver.exe");
		}
	  WebDriver driver = new ChromeDriver();
	@Given("enduser is on the login page")
	public void enduser_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   
	}

	@When("enduser enters {string} and {string} and click on submit button")
	public void enduser_enters_and_and_click_on_submit_button(String string, String string2) {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		WebElement username= driver.findElement(By.name("userName"));
		  username.sendKeys(string);
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys(string2);
		  WebElement button= driver.findElement(By.name("Login"));
		  button.click();
	   
	}

	@Then("user does successful login")
	public void user_does_successful_login() {
		System.out.println("error message");
	}



}
