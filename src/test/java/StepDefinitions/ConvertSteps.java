package StepDefinitions;

import convertnumbermodule.ConvertNumberFunction;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import universal.ApplicationConfig;
import universal.TestBase;

import java.util.concurrent.TimeUnit;

public class ConvertSteps extends TestBase {

    ConvertNumberFunction convertNumberFunction;
    String configFile="config.properties";

    @Before("")
    public void setUp() {
        browserSetUp(ApplicationConfig.readFromConfigProperties(configFile,"frontEndURL"));
    }

    @After("")
    public void tearDown()
    {
        closeBrowser();
    }


    @Given("open browser")
    @And("navigate to prettify number function page")
    public void navigate_to_prettify_number_function_page() {
        System.out.println("Check this step run - user is on prettify number function page");
        convertNumberFunction.navigateToConvertPage();
    }
    @When("user enters any number input")
    public void user_enters_any_number_input() {
        System.out.println("Check this step run - user enters any number input");
        convertNumberFunction.enterAnyNumber(ApplicationConfig.readFromConfigProperties(configFile,"input"));

    }
    @And("clicks on prettify button")
    public void clicks_on_prettify_button() {
        System.out.println("Check this step run - clicks on prettify button");
        convertNumberFunction.clickOnConvertButton();

    }
    @Then("show entered number prettified version")
    public void show_entered_number_prettified_version() {
        System.out.println("Check this step run - show entered number prettified version");
        convertNumberFunction.showResult();
        convertNumberFunction.verifyResultSuccessful();

    }


}
