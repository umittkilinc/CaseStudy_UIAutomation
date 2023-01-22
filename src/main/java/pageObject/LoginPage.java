package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button/span[text()='GİRİŞ YAP' or 'LOG IN']")
    private WebElement loginButton;

    public boolean defaultLoginPageIsDisplayed() {
        userName.isDisplayed();
        password.isDisplayed();
        loginButton.isEnabled();
        return true;
    }

    public void setUsername(String username) {
        userName.isEnabled();
        userName.click();
        userName.sendKeys(username);
    }

    public void setPassword(String PassWord) {
        password.isEnabled();
        password.click();
        password.sendKeys(PassWord);
    }

    public void clickLoginButton() {
        loginButton.isEnabled();
        loginButton.click();
    }

}
