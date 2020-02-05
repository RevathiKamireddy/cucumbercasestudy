package cucumberC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy3 {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chrome_driver\\chromedrivers\\chromedriver.exe");
		}
	WebDriver driver = new ChromeDriver();
	@Given("the user is on login page and login to his account")
	public void the_user_is_on_login_page_and_login_to_his_account() {
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  WebElement username= driver.findElement(By.name("userName"));
		  username.sendKeys("Lalitha");
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys("Password123");
		  WebElement button= driver.findElement(By.name("Login"));
		  button.click();
	}

	@When("user search for product in search engine")
	public void user_search_for_product_in_search_engine() {
		 WebElement password= driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
		  password.sendKeys("head");
		  WebElement finddetails= driver.findElement(By.xpath("//input[@type='submit']"));
		  finddetails.click(); 
		  WebElement addtocart= driver.findElement(By.linkText("Add to cart"));
		  addtocart.click();//for adding to cart
		  driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		  driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		  driver.get("http://10.232.237.143:443/PaymentGateway/loginhere.htm?radio=Andhra%20Bank");
		  WebElement username1=driver.findElement(By.name("username"));
		  username1.sendKeys("123456");
		  WebElement password1=driver.findElement(By.name("password"));
		  password1.sendKeys("Pass@456");
		  WebElement log= driver.findElement(By.xpath("//div[@class='user-right'][2]/input"));
		  log.click();
		  WebElement trans= driver.findElement(By.name("transpwd"));
		  trans.sendKeys("Trans@456");
		  WebElement paynow= driver.findElement(By.xpath("//div[@class='user-right']/input"));
		  paynow.click();
		  WebElement logout=driver.findElement(By.linkText("SignOut"));//for clicking 
		  logout.click();  
		
	   
	}

	@Then("user purchase the product")
	public void user_purchase_the_product() {
	    System.out.println("product purchased");
	}



}
