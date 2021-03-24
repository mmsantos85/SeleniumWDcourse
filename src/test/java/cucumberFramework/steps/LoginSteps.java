package cucumberFramework.steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmsan\\Bureaublad\\CucumberFramework\\src\\test\\java\\cucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Given("^User navigates to bol\\.com website$")
	public void user_navigates_to_bol_com_website() throws Throwable {
		driver.get("https://www.bol.com/nl/");
	}

	@Given("^User has to agree with cookies$")
	public void user_has_to_agree_with_cookies() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("js-confirm-button")).click();
	}
		
	@Given("^User clicks on the login button1$")
	public void user_clicks_on_the_login_button1() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]/span[1]")).click(); 
	}
	
	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("mmsantos85@gmail.com");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("Rotterdam-010-123");
	}

	@When("^User clicks on the login button2$")
	public void user_clicks_on_the_login_button2() throws Throwable {
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/input[1]")).click();
	}
	
	@Then("^User should be navigated to profile$")
	public void user_should_be_navigated_to_profile() throws Throwable {
		Thread.sleep(5000);
		WebElement HalloMelisaText = driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Assert.assertEquals(true, HalloMelisaText.isDisplayed());
	}
}
