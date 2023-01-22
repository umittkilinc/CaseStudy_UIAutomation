package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AssignSessionPage {

    WebDriver driver;

    public AssignSessionPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//input[@placeholder='Session Template Name' or @placeholder='Oturum Şablon Adı']")
    private WebElement sessionTemplates;

    @FindBy(xpath = "//*[@name='TEST_AUTOMATIN_OTURUM_ŞABLONU']")
    private WebElement sessionName;

    @FindBy(xpath = "(//*[@class='react-datepicker__input-container']//input[@type='text'])[1]")
    private WebElement periodStartDate;

    @FindBy(xpath = "//*[@class='react-datepicker__month-container']")
    private WebElement datePickerMonth;

    @FindBy(xpath = "(//*[@aria-disabled='false'])[25]")
    private WebElement startDay;

    @FindBy(xpath = "(//*[@class='react-datepicker__input-container']//input[@type='text'])[2]")
    private WebElement periodEndDate;

    @FindBy(xpath = "(//*[@aria-disabled='false'])[30]")
    private WebElement endDay;

    @FindBy(xpath = "//*[@name='assignmentType']")
    private WebElement assignmentType;

    @FindBy(xpath = "//span[text()='Single Assignment']")
    private WebElement singleAssignment;

    @FindBy(xpath = "(//input[@class='prompt'])[2]")
    private WebElement testTaker;

    @FindBy(xpath = "//button[@class='ui primary button']")
    // @FindBy(xpath = "//*[@class='result']")
    private WebElement assingSessionBtn;

    @FindBy(xpath = "//button[@class='Toastify__toast-body']")
    private WebElement successMsg;

    @FindBy(xpath = "(//span[text()='Super Admin'])[2]")
    private WebElement selectedTaker;

    @FindBy(xpath = "(//*[text()='Assign Session'])[2]")
    private WebElement assignSessionPage;

    public void selectSessionTemplate() {
        sessionTemplates.isDisplayed();
        sessionTemplates.click();
        sessionName.click();
    }

    public void selectPeriodStartDate() {
        periodStartDate.isDisplayed();
        periodStartDate.click();
        datePickerMonth.isDisplayed();
        startDay.isDisplayed();
        startDay.click();
    }

    public void selectPeriodEndDate() {
        periodEndDate.isDisplayed();
        periodEndDate.click();
        datePickerMonth.isDisplayed();
        endDay.isDisplayed();
        endDay.click();
        periodEndDate.click();
    }

    public void selectAssignmentType() {
        assignmentType.isDisplayed();
        assignmentType.click();
        singleAssignment.isDisplayed();
        singleAssignment.click();
    }


    public void selectTestTaker(String taker) {
        testTaker.isDisplayed();
        testTaker.click();
        testTaker.sendKeys(taker);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN);
        action.sendKeys(Keys.ENTER);
        action.build().perform();
        selectedTaker.isDisplayed();
    }

    public void clickAssignSessionBtn(){
        assingSessionBtn.isDisplayed();
        assingSessionBtn.click();
    }
}
