package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	WebDriver driver;

	@Given(": User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

//	@When(": User enters username")
//	public void user_enters_username() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//
//	}
//	
//	//example of data driver directly in feature
//	@When(": User enters {string}")
//	public void user_enters(String password) {
//		driver.findElement(By.id("txtPassword")).sendKeys(password);
//	}

	@When("^: User enters (.+) and (.+)$")
    public void _user_enters_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
	
	@When(": clicks on Login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then(": User should be able to login successfuly")
	public void user_should_be_able_to_login_successfuly() {
		driver.quit();
	}

}
