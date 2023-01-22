package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AssignSessionPage;
import pageObject.SessionsPage;
import utilities.TestContext;

public class AssignSessionSteps {

    TestContext testContext;
    SessionsPage sessionsPage;
    AssignSessionPage assignSessionPage;

    public AssignSessionSteps(TestContext context) {
        testContext = context;
        sessionsPage = testContext.getPageObjectManager().getSessionsPage();
        assignSessionPage = testContext.getPageObjectManager().getAssignSessionPage();
    }

    @When("Click sessions menu")
    public void click_sessions_menu() {
        sessionsPage.clickSessions();
    }

    @When("Click on the assign session button")
    public void click_on_the_assign_session_button() {
        sessionsPage.clickSessionAssignButton();
    }

    @When("Select session templates")
    public void select_session_templates() {
        assignSessionPage.selectSessionTemplate();
    }

    @When("Enter period start time")
    public void enter_period_start_time() {
        assignSessionPage.selectPeriodStartDate();
    }

    @When("Enter period end time")
    public void enter_period_end_time() {
        assignSessionPage.selectPeriodEndDate();
    }

    @When("Select assignment type {string}")
    public void select_assignment_type(String string) {
        assignSessionPage.selectAssignmentType();

    }

    @When("Select test taker {string}")
    public void select_test_taker(String string) {
        assignSessionPage.selectTestTaker(string);
    }

    @Then("Click assign session")
    public void click_assign_session() {
        assignSessionPage.clickAssignSessionBtn();
    }

}
