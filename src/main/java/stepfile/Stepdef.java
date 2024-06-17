package stepfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	
	WebDriver driver;
	
	@Given("^User should be able to view  Button,Image box$")
	public void user_should_be_able_to_view_Button_Image_box() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	  @When("^When user click on Button image$") public void
	  when_user_click_on_Button_image() throws Throwable {
	  
	  driver.findElement(By.xpath("//img[@alt='Buttons']")).click(); // Write code
	//  here that turns the phrase above into concrete actions
	  
	  }
	 

	@Then("^The button page  should be displayed$")
	public void the_button_page_should_be_displayed() throws Throwable {
		
		//Click on the  Home Page 
		
		driver.findElement(By.xpath("//button[normalize-space()='Go to Home Page']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
