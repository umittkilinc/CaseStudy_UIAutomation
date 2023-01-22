package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.TestingPage;
import utilities.TestContext;

public class TestingProcessSteps {

    TestContext testContext;
    HomePage homePage;
    TestingPage testingPage;

    public TestingProcessSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        testingPage = testContext.getPageObjectManager().getTestingPage();
    }

    @When("Click home menu")
    public void click_home_menu(){
        homePage.clickHome();
    }

    @Then("Click first start test button")
    public void click_first_start_test_button(){
        homePage.clickStartTestFirstButton();
    }

    @Then("Click second start test button")
    public void click_second_start_test_button(){testingPage.clickStartTestSecondButton();}

    @Then("Answer first question")
    public void answer_first_question(){
        testingPage.firstQuestionClickAnswerRadioButton();
    }

    @Then("Answer second question")
    public void answer_second_question(){
        testingPage.secondQuestionClickAnswerRadioButton();
    }

    @Then("Answer third question")
    public void answer_third_question(){ testingPage.enterAnswer(); }

    @Then("Answer fourd question")
    public void answer_fourd_question(){testingPage.dragAndDropAnswer();}

    @Then("Click first finished test button")
    public void click_first_finished_test_button() {
        testingPage.clickFirstFinishButton();
    }
    @Then("Click second finished test button")
    public void click_second_finished_test_button() {
        testingPage.clickSecondFinishButton();
    }
    @Then("See completed button")
    public void see_completed_button() {
        testingPage.seeCompletedButton();
    }

}
