import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    //login selectors
    final By usernameLoginInput = By.xpath( "//form[@class='sign-in-form']//input[@placeholder='Username']");
    final By passwordLoginInput = By.xpath("//form[@class='sign-in-form']//input[@placeholder='Password']");
    final By loginButton = By.name("login");

    //register selectors
    final By newHereButton = By.id("sign-up-btn");
    final By fullnameInput = By.name("fullname");
    final By usernameRegisterInput = By.xpath("//form[@class='sign-up-form']//input[@placeholder='Username']");
    final By emailInput = By.name("email");
    final By passwordRegisterInput = By.xpath("//form[@class='sign-up-form']//input[@placeholder='Password']");
    final By confirmPasswordInput = By.name("confirm_password");
    final By registerButton = By.name("register");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getUsernameLoginInput() {
        return usernameLoginInput;
    }

    public By getPasswordLoginInput() {
        return passwordLoginInput;
    }

    public By getLoginButton() {
        return loginButton;
    }

    public By getNewHereButton() {
        return newHereButton;
    }

    public By getFullnameInput() {
        return fullnameInput;
    }

    public By getUsernameRegisterInput() {
        return usernameRegisterInput;
    }

    public By getEmailInput() {
        return emailInput;
    }

    public By getPasswordRegisterInput() {
        return passwordRegisterInput;
    }

    public By getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public By getRegisterButton() {
        return registerButton;
    }
}
