import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestFormKatalon {

    WebDriver driver;
    String nameId = "first-name";
    String lastnameId = "last-name";
    String male = "gender";
    String female = "/html/body/div/div/form/div[3]/div/div/label[2]";
    String inBeetwen = "/html/body/div/div/form/div[3]/div/div/label[3]";
    String dateOfBirth  ="dob";
    String address = "address";
    String email = "email";
    String password = "password";
    String company = "company";
    String role = "role";
    String expectation = "expectation";
    String readBooks ="/html/body/div/div/form/div[11]/div/div[1]/label/input";
    String TakeOnlineCourses ="";
    String contributeToOpensourceProjects ="";
    String joinTechCons ="/html/body/div/div/form/div[11]/div/div[4]/label";
    String readTechBlogs ="";
    String viaDiscoveryAndExperiment ="";
    String comment = "comment";
    String submitMsg ="submit-msg";
    String submitButtonId = "submit";

    String firstNameErrorId ="first-name-error";
    String lastnameErrorId = "last-name-error";
    String maleErrorId = "gender-error";
    String dateOfBirthErrorId  ="dob-error";
    String addressErrorId = "address-error";
    String emailErrorId = "email-error";
    String passwordErrorId = "password-error";
    String companyErrorId = "company-error";










    @Before
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "src/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Ignore
    @Test
    public void testValidUserRegistration() {
        WebElement nameField = driver.findElement(By.id(nameId));
        if (nameField.isDisplayed()) {
            nameField.click();
            nameField.clear();
            nameField.sendKeys("Karol");
            System.out.println("Wpisuję w pole o id=" + nameId + " wartość: Karol");
        } else {
            Assert.fail();
        }

        WebElement lastNameField = driver.findElement(By.id(lastnameId));
        lastNameField.click();
        lastNameField.clear();
        lastNameField.sendKeys("Kowal");

        WebElement maleField = driver.findElement(By.name(male));
        maleField.click();

        WebElement dateOfBirthField = driver.findElement(By.id(dateOfBirth));
        dateOfBirthField.click();
        dateOfBirthField.clear();
        dateOfBirthField.sendKeys("07/27/1983");

        WebElement addressField = driver.findElement(By.id(address));
        addressField.click();
        addressField.clear();
        addressField.sendKeys("Świebodzka");

        WebElement emailField = driver.findElement(By.id(email));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("karol@gmail.com");

        WebElement passwordField = driver.findElement(By.id(password));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("123!@");

        WebElement companyField = driver.findElement(By.id(company));
        companyField.click();
        companyField.clear();
        companyField.sendKeys("CodersLab");

        Select roleFiled = new Select(driver.findElement(By.id(role)));
        //     roleFiled.deselectAll();
        roleFiled.selectByVisibleText("Manager");

        Select expectationFiled = new Select(driver.findElement(By.id(expectation)));
        expectationFiled.selectByVisibleText("High salary");

        WebElement readBooksField = driver.findElement(By.xpath(readBooks));
        readBooksField.click();

        WebElement joinTechConsField = driver.findElement(By.xpath(joinTechCons));
        joinTechConsField.click();

        WebElement commentField = driver.findElement(By.id(comment));
        commentField.click();
        commentField.clear();
        commentField.sendKeys("I gitara!!!");

        WebElement submitField = driver.findElement(By.id(submitButtonId));
        submitField.click();

        WebElement link = driver.findElement(By.id(submitMsg));
        String textLinku = link.getText();
        String oczekiwanyTekst = "Successfully submitted!";
        System.out.println("Text linku: " + textLinku);
        assertTrue(textLinku.equals(oczekiwanyTekst));
    }

     @Test
     public void errorHandling(){
            WebElement submitButton = driver.findElement(By.id(submitButtonId));
            submitButton.click();

            WebElement lastnameErrorId = driver.findElement(By.id(firstNameErrorId));
            assertTrue(lastnameErrorId.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());

            WebElement firstNameErrorMassage = driver.findElement(By.id(firstNameErrorId));
            assertTrue(firstNameErrorMassage.isDisplayed());
    }



    @After
        public void tearDown(){
         //   driver.quit();
        }
}

