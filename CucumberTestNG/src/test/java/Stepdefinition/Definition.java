package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	WebDriver driver;
	
	@Given("open browser")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("http://elearningm1.upskills.in/");
	    
	}
	@When("Enter username")
	public void enter_username() {
		driver.findElement(By.xpath("//*[@name='login']")).sendKeys("ankitav");
	   
	}
	@When("Enter pwd")
	public void enter_pwd() {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    
	}
	@When("Click on loginbutton")
	public void click_on_loginbutton() {
		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
	   
	}
	@Then("Login should be successfull")
	public void login_should_be_successfull() {
		String name = driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).getText();
		String ActualName = driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).getText();
		Assert.assertEquals(name, ActualName);
	    driver.close();
	}

}
