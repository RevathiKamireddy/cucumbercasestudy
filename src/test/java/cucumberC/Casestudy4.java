package cucumberC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy4 {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chrome_driver\\chromedrivers\\chromedriver.exe");
		}
	WebDriver driver = new ChromeDriver();
	@Given("Alex has registered into testme app")
	public void alex_has_registered_into_testme_app() {
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  WebElement username= driver.findElement(By.name("userName"));
		  username.sendKeys("Lalitha");
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys("Password123");
		  WebElement button= driver.findElement(By.name("Login"));
		  button.click();
	    
	}

	@When("Alex search for particular product like headphones")
	public void alex_search_for_particular_product_like_headphones() {
		WebElement password= driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
		  password.sendKeys("head");
		  WebElement finddetails= driver.findElement(By.xpath("//input[@type='submit']"));
		  finddetails.click(); 
		  WebElement addtocart= driver.findElement(By.linkText("Add to cart"));
		  addtocart.click();//for adding to cart
		  driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		  
		  
	   
	}

	@When("try to proceed to payment without adding any thing to it")
	public void try_to_proceed_to_payment_without_adding_any_thing_to_it() {
		WebElement remove= driver.findElement(By.xpath("//form/input[2]"));
		  remove.click(); 
	    
	}

	@Then("testme app doesnt display the cart icon")
	public void testme_app_doesnt_display_the_cart_icon() {
		System.out.println("no items in cart");
	    
	}

}
