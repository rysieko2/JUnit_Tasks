import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GetText {
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
    public  void testInnerText()   {

        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
    }

    @After
    public void tearDown(){
        //   driver.quit();
    }






}
