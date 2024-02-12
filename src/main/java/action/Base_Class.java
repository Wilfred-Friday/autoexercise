package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Base_Class {
    public WebDriver driver = null;

    public void pSetBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    // Navigate to a URL
    public void navigateToURL(String url) {
        driver.get(url);
    }

    // Find a WebElement by a given By locator
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    // Click on a WebElement
    public void clickElement(WebElement element) {
        element.click();
    }

    // Type text into a WebElement
    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Get the title of the current page
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Quit the WebDriver
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void getIframe(){
        driver.switchTo().frame(0);
    }

    public void quitIframe(){
        driver.switchTo().defaultContent();
    }

    public  void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println(locator + " Is present");
    }

    public String pRead_Properties_Files(String key){
        String flag = null;
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/GlobalData.properties"));
            flag = prop.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }



}
