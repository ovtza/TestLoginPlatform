import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    RegisterPage page;

    public static final String pageUrl = "http://localhost/netguru/User-Account-Sign-up-and-Sign-in/";

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Given("open example login page")
    public void openPage() {
        driver.get(pageUrl);
    }

    @And("click the new here sign up button")
    public void clickNewHereSignUpButton() {
        page = new RegisterPage(driver);
        driver.findElement(page.getNewHereButton()).click();
    }

    @And("type {string} in fullname input")
    public void typeWordInFullnameInput(String fullname) {
        page = new RegisterPage(driver);
        driver.findElement(page.getFullnameInput()).sendKeys(fullname);
    }

    @And("type {word} in username register input")
    public void typeWordInUsernameInput(String username) {
        page = new RegisterPage(driver);
        driver.findElement(page.getUsernameRegisterInput()).sendKeys(username);
    }

    @And("type {word} in email input")
    public void typeWordInEmailInput(String email) {
        page = new RegisterPage(driver);
        driver.findElement(page.getEmailInput()).sendKeys(email);
    }

    @And("type {word} in password register input")
    public void typeWordInRegisterPAsswordInput(String password) {
        page = new RegisterPage(driver);
        By passwordRegisterInput = page.getPasswordRegisterInput();

        driver.findElement(passwordRegisterInput).clear();
        driver.findElement(passwordRegisterInput).sendKeys(password);
    }

    @And("type {word} in confirm password input")
    public void typeWordInConfirmPasswordInput(String password) {
        page = new RegisterPage(driver);
        By passwordConfirmInput = page.getConfirmPasswordInput();

        driver.findElement(passwordConfirmInput).clear();
        driver.findElement(passwordConfirmInput).sendKeys(password);
    }

    @Then("click sign up button")
    public void clickTheSignUpButton() {
        page = new RegisterPage(driver);
        driver.findElement(page.getRegisterButton()).click();
    }

    @And("wait {int} seconds for async proccesing")
    public void aVeryBadWait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @And("type {word} in username input")
    public void typeWordInUsernameLoginInput(String username) {
        page = new RegisterPage(driver);
        driver.findElement(page.getUsernameLoginInput()).sendKeys(username);
    }

    @And("type {word} in password input")
    public void typeWordInPasswordLoginInput(String password) {
        page = new RegisterPage(driver);
        driver.findElement(page.getPasswordLoginInput()).sendKeys(password);
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        page = new RegisterPage(driver);
        driver.findElement(page.getLoginButton()).click();
    }

    @Then("user has successfully logged in")
    public void checkIfUserLoggedIn() {
        page = new RegisterPage(driver);
        Assert.assertEquals(driver.switchTo().alert().getText(), "You Login successfully");
    }

    @Then("user has not successfully logged in")
    public void checkIfUserNotLoggedIn() {
        page = new RegisterPage(driver);
        Assert.assertEquals(driver.switchTo().alert().getText(), "User not registered with us");
    }

    @Then("account has been successfully created")
    public void checkIfUserCreatedAnAccount() {
        page = new RegisterPage(driver);
        Assert.assertEquals(driver.switchTo().alert().getText(), "Your account have successfully registered");
    }

    @Then("account has not been successfully created due to password does not match")
    public void checkIfBothPasswordsTheSame() {
        page = new RegisterPage(driver);
        Assert.assertEquals(driver.switchTo().alert().getText(), "your passwords does not match");
    }

    @Then("create example account with username {word}")
    public void createExampleUserWithUsername(String username) {
        page = new RegisterPage(driver);
        typeWordInFullnameInput("Test Test");
        typeWordInUsernameInput(username);
        typeWordInEmailInput("test@test.eu");
        typeWordInRegisterPAsswordInput("test");
        typeWordInConfirmPasswordInput("test");
    }
}
