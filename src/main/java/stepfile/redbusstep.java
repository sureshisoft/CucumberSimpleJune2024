package stepfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class redbusstep {
	
	 WebDriver driver;
	
	@Given("^user should be give Redbus url$")
	public  void user_should_be_give_Redbus_url() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.redbus.com");
	
	    
	}

	@When("^user should enter from place and to place and Date$")
	public  void user_should_enter_from_place_and_to_place_and_Date() throws Throwable {
		
		driver.findElement(By.id("src")).sendKeys("Chennai",Keys.RETURN);
		driver.findElement(By.id("dest")).sendKeys("Salem",Keys.RETURN);
		Thread.sleep(5000);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("/*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[6]")).click();
	   
	}

	@Then("^User should click on Searchbuses link$")
	public void user_should_click_on_Searchbuses_link() throws Throwable {
		
		driver.findElement(By.id("search_btn")).click();
	   
	}



}
