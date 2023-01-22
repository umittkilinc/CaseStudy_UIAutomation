package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.FileReaderManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utilities.TestContext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    TestContext testContext;
    WebDriver webDriver;

    public Hooks(TestContext context) {
        testContext = context;
    }

    String screenShotPath = "./target/screenshots/";

    @Before
    public void setUp() {
        webDriver = testContext.getDriverManager().getDriver();
        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
    }


    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        testContext.getDriverManager().closeDriver();
    }
}
