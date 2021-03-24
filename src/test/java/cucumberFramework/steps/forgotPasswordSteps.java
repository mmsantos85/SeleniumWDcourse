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


public class forgotPasswordSteps {
	
	WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmsan\\Bureaublad\\CucumberFramework\\src\\test\\java\\cucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Given("^user navigates to bol\\.com$")
	public void user_navigates_to_bol_com() throws Throwable {
		driver.get("https://www.bol.com/nl/");
	}

	@Given("^user has to accept cookies$")
	public void user_has_to_accept_cookies() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("js-confirm-button")).click();
	}
	
	@Given("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]/span[1]")).click(); 
	}

	@Given("^user enters a valid e-mail adress$")
	public void user_enters_a_valid_e_mail_adress() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("mmsantos85@gmail.com");
	}

	@Then("^user clicks on wachtwoord vergeten\\?$")
	public void user_clicks_on_wachtwoord_vergeten() throws Throwable {
		driver.findElement(By.xpath("//input[@id='forgot_password']")).click();
	}

	@Then("^user navigates to request new password page$")
	public void user_navigates_to_request_new_password_page() throws Throwable {
		driver.get("https://www.bol.com/nl/rnwy/account/forgotpassword?bltgh=n3tHWOi-hD-6CTziwPJK1A.2.3.Login");
	}

	@Then("^user fills in e-mail adress$")
	public void user_fills_in_e_mail_adress() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("mmsantos85@gmail.com");
	} 

	@Then("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/form[1]/fieldset[2]/div[1]/input[1]")).click();
	}
	
	@Then("^user should get a message stating that a e-mail has been send with a personal link to reset password$")
	public void user_should_get_a_message_stating_that_a_e_mail_has_been_send_with_a_personal_link_to_reset_password() throws Throwable {
		Thread.sleep(5000);
		WebElement TerugNaarInloggen = driver.findElement(By.xpath("//a[contains(text(),'Terug naar inloggen')]"));
		Assert.assertEquals(true, TerugNaarInloggen.isDisplayed());
	  }
	}