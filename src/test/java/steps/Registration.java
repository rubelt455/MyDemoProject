package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
    public static WebDriver driver;
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {


            String url="https://abc9262.sg-host.com/";
            System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\workspace\\MyFirstProjectt\\chromedriver.exe");
            // Instantiate a ChromeDriver class.driver = new ChromeDriver();
            driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        }

    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String userName) {
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(userName);

    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String email) {
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(email);

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(password);

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();

    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {



        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
        String dashboardTextValue = dashboardText.getText();

        if (dashboardTextValue.equals("Dashboard")) {
            System.out.println("Verification Passed: Dashboard text is displayed.");
        } else {
            System.out.println("Verification Failed: Dashboard text is not displayed.");
        }
    }

    }


