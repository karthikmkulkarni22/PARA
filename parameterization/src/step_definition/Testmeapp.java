package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	public static WebDriver driver;
	@Given("^user navigates to testmeapp$")
	public void user_navigates_to_testmeapp() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("SIGN-ON")).click();
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	/*PLS UPDATE */
	@Then("^login should be unsuccessful$")
	public void validateRelogin() { 
		
		System.out.println(" password is wrong "); 
		driver.close();  
				} 

				}
