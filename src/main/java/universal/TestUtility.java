package universal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestUtility {
    WebDriver driver;

    private int timeout=Integer.parseInt(ApplicationConfig.readFromConfigProperties("config.properties", "timeout"));


    public TestUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementPresent(WebElement element) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForAlertPresent(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.alertIsPresent());
    }




}
