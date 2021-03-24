package cucumberFramework.steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newUser {
    
WebDriver driver;
    
    @Before()
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mmsan\\\\Bureaublad\\\\CucumberFramework\\\\src\\\\test\\\\java\\\\cucumberFramework\\\\resources\\\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);      
    }
    
    @Given("^User is navigates to bol\\.com$")
    public void user_is_navigates_to_bol_com() throws Throwable {
        driver.get("https://www.bol.com/nl/");
    }
    
    @Given("^user clicks on agree cookies1$")
    public void user_clicks_on_agree_cookies() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.className("js-confirm-button")).click();
    }
      
    @Given("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        Thread.sleep(5000);
       
        driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]/span[1]")).click();
    }
    @Given("^user thicks on own account$")
    public void user_thicks_on_own_account() throws Throwable {
        driver.findElement(By.xpath("//input[@id='newuserPrivate']")).click();
    }
    
    @Given("^user enters valid email$")
    public void user_enters_valid_email() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='login_email_new']")).sendKeys("issatest211@gmail.com");
    }
    
    @When("^user clicks on make an account$")
    public void user_clicks_on_make_an_account() throws Throwable {
        driver.findElement(By.xpath("//input[@id='button_new_user_new_checkout']")).click();
    }
    
    @Then("^user should be navigated to registration form$")
    public void user_should_be_navigated_to_registration_form() throws Throwable {
        Thread.sleep(5000);
//        WebElement askQuestionsAanhef = driver.findElement(By.xpath("//p[contains(text(),'Aanhef *')]"));
//        Assert.assertEquals(true, askQuestionsAanhef.isDisplayed())
        driver.get("https://www.bol.com/nl/rnwy/account/register.html?redirectUrl=https%3A%2F%2Fwww.bol.com%2Fnl%2Frnwy%2Faccount%2Foverzicht&bltgh=uueJGLhu7xzpw8BYTXVPBA.2.4.NewUser");
    }
}