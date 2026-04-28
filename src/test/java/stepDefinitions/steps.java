package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class steps {
	WebDriver driver;
	@Given("when user navigates to website")
	public void navigateToPage() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		//a[normalize-space()='Login']
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
	}

	@Given("enters login details \\(username: {string},password: {string})")
	public void enters_login_details_username_password(String un, String pwd) {
		// Write code here that turns the phrase above into concrete actions
		//input[@id='input-email']
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	}

	@Given("user clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		//input[@value='Login']
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
		// Write code here that turns the phrase above into concrete actions
		//h2[normalize-space()='My Account']
		boolean my_Acc=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		Assert.assertEquals(my_Acc, true);


	}

}
