package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumberTestReport.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "timeline:target/test-output-thread/"},
        dryRun = false,
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\n<================ BEFORE SUITE ================>");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("\n<================ AFTER SUITE ================>");
    }
}
