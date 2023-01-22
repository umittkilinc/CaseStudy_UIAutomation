package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SessionsPage {

    public SessionsPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//a[text()='Sessions']")
    private WebElement sessionsMenu;

    //@FindBy(xpath = "(//button[text()='Oturum Ata' or 'Assign Session'])[3]")
    @FindBy(xpath = "//button[@class='ui button src-scenes-session-components-SessionCreateButton-SessionCreateButton__button']")
    private WebElement assignSessionButton;

    public void clickSessions() {
        sessionsMenu.isDisplayed();
        sessionsMenu.click();
    }

    public void clickSessionAssignButton() {

        assignSessionButton.isDisplayed();
        assignSessionButton.click();
    }




}
