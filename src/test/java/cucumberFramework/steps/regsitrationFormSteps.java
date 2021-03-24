package cucumberFramework.steps;

import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class regsitrationFormSteps {

	WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmsan\\Bureaublad\\CucumberFramework\\src\\test\\java\\cucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
}
	
	@Given("^that the user is at the registration form page$")
	public void that_the_user_is_at_the_registration_form_page() throws Throwable {
		driver.get("https://www.bol.com/nl/rnwy/account/register.html?redirectUrl=https%3A%2F%2Fwww.bol.com%2Fnl%2Frnwy%2Faccount%2Foverzicht&bltgh=m85a4T-NZzJv2n0Xoq5KnQ.2.4.NewUser");
	}
	
	@Given("^user clicks on agree cookies$")
	public void user_clicks_on_agree_cookies() throws Throwable  {
		Thread.sleep(5000);
		driver.findElement(By.className("js-confirm-button")).click();
	}

	@Then("^user ticks Ms$")
	public void user_ticks_Ms() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.prefixF']")).click();
	}

	@Then("^the user should type her first name$")
	public void the_user_should_type_her_first_name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.firstName']")).sendKeys("Marissa");
	}

	@Then("^the user should type her insertion$")
	public void the_user_should_type_her_insertion() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.infix']")).sendKeys("De");
	}
	
	@Then("^the user should type her last name$")
	public void the_user_should_type_her_last_name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.lastName']")).sendKeys("Graaf");
	}

	@Then("^the user thicks Nederlands$")
	public void the_user_thicks_Nederlands() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Nederland')]")).click();
	}

	@Then("^user should type a valid zipcode$")
	public void user_should_type_a_valid_zipcode() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.zipCode']")).sendKeys("3024");
	}

	@Then("^user should type a valid house number$")
	public void user_should_type_a_valid_house_number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='address.houseNumberWithExtension']")).sendKeys("285");
		
	}

	@Then("^the user should type a valid phone number$")
	public void the_user_should_type_a_valid_phone_number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='account_phone_number']")).sendKeys("0624557082");
	}

	@Then("^email should be already inserted$")
	public void email_should_be_already_inserted() throws Throwable {
		driver.findElement(By.xpath("//input[@id='account_email']")).sendKeys("issatest211@gmail.com");;
	}

	@Then("^the user should type a valid password$")
	public void the_user_should_type_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='account_password']")).sendKeys("uH-$d2G?BTVej@u");
	}

	@Then("^the user should decide if she wants newsletters$")
	public void the_user_should_decide_if_she_wants_newsletters() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Persoonlijke aanbevelingen')]")).click();
		
	}
	
	@Then("^the user clicks on the send button$")
	public void the_user_clicks_on_the_send_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='button_send']")).click();
	}
}
	
