package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObject.HomePage;
import pageObject.LoginPage;
import utilities.TestContext;

public class LoginSteps {

    TestContext testContext;
    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("Access the webdriver login page")
    public void access_the_webdriver_login_page() {
        Assert.assertTrue(loginPage.defaultLoginPageIsDisplayed());
    }

    @When("Enter username {string}")
    public void enter_username(String string) {
        loginPage.setUsername(string);
    }

    @When("Enter password {string}")
    public void enter_password(String string) {
        loginPage.setPassword(string);
    }

    @When("Click on the login button")
    public void click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("See it's on the home page")
    public void see_it_s_on_the_home_page() {
        homePage.seeHomePageIsDisplayed();
    }

}
