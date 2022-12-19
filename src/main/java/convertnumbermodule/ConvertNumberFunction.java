package convertnumbermodule;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import universal.ApplicationConfig;
import universal.TestBase;
import universal.TestUtility;

public class ConvertNumberFunction extends TestBase {

    WebDriver driver;
    TestUtility testUtility;
    String input=ApplicationConfig.readFromConfigProperties(
            "config.properties", "input");
    String expectedOutput=ApplicationConfig.readFromConfigProperties(
            "config.properties", "expectedOutput");


    @FindBy(id = "xxxx")
    WebElement prettifyNumber;

    @FindBy(name = "yyyy")
    WebElement convertButton;

    @FindBy(name="zzz")
    WebElement result;

    String actualResult;

    public ConvertNumberFunction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void navigateToConvertPage(){
        driver.navigate().to("https://google.com");
    }

    public void enterAnyNumber(String input){
        driver.findElement(By.name("prettifyNumber")).sendKeys(input);
    }

    public void clickOnConvertButton(){
        driver.findElement(By.id("convertButton")).sendKeys();
    }

    public void showResult(){
        actualResult=driver.findElement(By.id("result")).getText();
    }

    public boolean verifyResultSuccessful(){
        if(actualResult.equalsIgnoreCase(expectedOutput)){
            System.out.println("Number prettification function working fine");
            return true;
        }else {
            System.out.println("Number prettification function not working");
            return false;
        }
    }


}
