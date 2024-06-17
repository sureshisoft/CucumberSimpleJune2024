package stepfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepdef {
	WebDriver driver;
	
	@Given("User Google chrome url")
	public void user_google_chrome_url() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-orgins=*");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user enter text in Google chrome")
	public void user_enter_text_in_google_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement ele= driver.findElement(By.name("q"));
	 ele.sendKeys("Suresh",Keys.RETURN);
	    
	}
	@Then("Search result should be displayed")
	public void search_result_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Searchresult shouldbe displayed ");
	    
	}


}
