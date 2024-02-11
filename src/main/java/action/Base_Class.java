package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
}
