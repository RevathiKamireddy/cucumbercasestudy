package cucumberC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 {
	static{System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chrome_driver\\chromedrivers\\chromedriver.exe");}
	  WebDriver driver = new ChromeDriver();
	@Given("User is on signup page")
	public void user_is_on_signup_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement find= driver.findElement(By.linkText("SignUp"));//clicking signup button
		  find.click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} and click register button")
	public void user_enters_and_click_register_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
		
//		  WebElement register=driver.findElement(By.linkText("SignUp"));
//		  register.click();
		  WebElement name=driver.findElement(By.name("userName"));
		  name.sendKeys(string);
		  WebElement firstName=driver.findElement(By.name("firstName"));
		  firstName.sendKeys(string2);
		  WebElement lastName=driver.findElement(By.name("lastName"));
		  lastName.sendKeys(string3);
		  WebElement pa=driver.findElement(By.name("password"));
		  pa.sendKeys(string4);
		  WebElement cpd=driver.findElement(By.name("confirmPassword"));
		  cpd.sendKeys(string5);
		  WebElement female=driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[2]"));
		  female.click();
		  WebElement email=driver.findElement(By.name("emailAddress"));
		  email.sendKeys(string6);
		  WebElement mobile=driver.findElement(By.name("mobileNumber"));
		  mobile.sendKeys(string7);
		  WebElement dob=driver.findElement(By.name("dob"));
		  dob.sendKeys(string8);
		  WebElement address=driver.findElement(By.name("address"));
		  address.sendKeys(string9);
		  WebElement secques=driver.findElement(By.name("securityQuestion"));
		  secques.sendKeys("What is your Birth Place");
		  WebElement ans=driver.findElement(By.name("answer"));
		  ans.sendKeys("salem");
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User should be navigated to login page")
	public void user_should_be_navigated_to_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
