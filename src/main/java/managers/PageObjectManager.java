package managers;

import org.openqa.selenium.WebDriver;
import pageObject.*;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SessionsPage sessionsPage;
    private AssignSessionPage assignSessionPage;
    private TestingPage testingPage;


    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public SessionsPage getSessionsPage() {
        return (sessionsPage == null) ? sessionsPage = new SessionsPage(webDriver) : sessionsPage;
    }

    public AssignSessionPage getAssignSessionPage() {
        return (assignSessionPage == null) ? assignSessionPage = new AssignSessionPage(webDriver) : assignSessionPage;
    }

    public TestingPage getTestingPage() {
        return (testingPage == null) ? testingPage = new TestingPage(webDriver) : testingPage;
    }

}
