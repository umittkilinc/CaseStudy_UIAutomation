package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//*[text()='Super']")
    private WebElement name;

    @FindBy(xpath = "//a[text()='Home']")
    private WebElement home;

    @FindBy(xpath = "(//span[text()='Start Test'])[2]")
    private WebElement firstStartTestBtn;

    public boolean seeHomePageIsDisplayed(){
        name.isDisplayed();
        return true;
    }

    public void clickHome(){
        home.isDisplayed();
        home.click();
    }

    public void clickStartTestFirstButton(){
        firstStartTestBtn.isDisplayed();
        firstStartTestBtn.click();
    }

}
