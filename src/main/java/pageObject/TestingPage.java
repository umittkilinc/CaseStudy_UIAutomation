package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TestingPage {

    WebDriver driver;

    public TestingPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//button[text()='Start the Test']")
    private WebElement secondStartTestBtn;

    @FindBy(xpath = "(//*[@class='ql-editor src-common-components-RichLabel-RichLabel__richLabel false false src-common-components-Questions-Questions__optionText'])[1]")
    private WebElement selectionFirst;

    @FindBy(xpath = "//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon']")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@class='ql-editor ql-blank']")
    private WebElement writeAnswer;

    @FindBy(xpath = "(//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]")
    private WebElement nextButton2;

    @FindBy(xpath ="(//*[@class='src-common-components-Questions-DragAndDrop-BlankItem__blankItem'])[2]")
    //@FindBy(xpath = "//*[text()='Test1']")
    private WebElement drag;

    @FindBy(xpath = "(//*[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[1]")
    private WebElement drop;

    @FindBy(xpath = "//*[text()='Finish Test']")
    private WebElement finishButton;

    @FindBy(xpath = "//*[text()='Completed']")
    private WebElement completedButton;

    public void clickStartTestSecondButton(){
        secondStartTestBtn.isDisplayed();
        secondStartTestBtn.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void firstQuestionClickAnswerRadioButton() {
        selectionFirst.isDisplayed();
        selectionFirst.click();
        nextButton.isDisplayed();
        nextButton.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void secondQuestionClickAnswerRadioButton() {
        selectionFirst.isDisplayed();
        selectionFirst.click();
        nextButton2.isDisplayed();
        nextButton2.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterAnswer(){
        writeAnswer.isDisplayed();
        writeAnswer.sendKeys("Auto Answer");
        nextButton2.isDisplayed();
        nextButton2.click();
    }

    public void dragAndDropAnswer(){
        drag.isDisplayed();
        drop.isDisplayed();
        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop);
        action.build().perform();
    }

    public void clickFirstFinishButton(){
        finishButton.isDisplayed();
        finishButton.click();
    }

    public void clickSecondFinishButton(){
        finishButton.isDisplayed();
        finishButton.click();
    }

    public boolean seeCompletedButton(){
        completedButton.isDisplayed();
        return true;
    }
}
