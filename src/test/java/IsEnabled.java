import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class IsEnabled {
    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "src/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public  void testInnerText() {

        WebElement search = driver.findElement(By.id("searchInput"));
        if (search.isEnabled()) {
            search.sendKeys("Selenium");
            search.submit();
        } else {
            Assert.fail();
        }
    }
    @After
    public void tearDown() {
        //   driver.quit();
    }

}
