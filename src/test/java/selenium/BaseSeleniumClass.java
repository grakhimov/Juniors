package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumClass {
    public static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;
    }

    public static void quit() { //closes browser
        driver.quit();
        driver = null;
    }

    public static void close() { //closes browser tab
        driver.close();
        driver = null;
    }

    @Test
    public void testa() {
        getDriver().get("http://www.google.com/");
        WebElement searchBox = getDriver().findElement(By.name("q"));
        WebElement a = getDriver().findElement(By.id("webElementId"));
        WebElement b = getDriver().findElement(By.xpath("//div[contains(text(), 'hgsuithuigtn')]"));
        WebElement c = getDriver().findElement(By.cssSelector(".cssValue1 .cssValue2"));
        WebElement d = getDriver().findElement(By.linkText("http://www.google.com/"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        getDriver().quit();
    }
}
