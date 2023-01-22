package managers;

import enums.DriverType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class AllDriverManager {

    private WebDriver webDriver;
    private static DriverType driverType;

    public AllDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
    }

    private WebDriver createDriver() {

        String browserVersion = FileReaderManager.getInstance().getConfigFileReader().getVersion();

        switch (driverType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_v"+browserVersion+".exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //chromeOptions.addArguments("--auto-open-devtools-for-tabs");
                webDriver = new ChromeDriver(chromeOptions);
                webDriver.manage().window().maximize();
                break;
            case FIREFOX:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_v109.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case EDGE:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_v109.exe");
                webDriver = new EdgeDriver();
                break;
            case SAFARI:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_v109.exe");
                webDriver = new SafariDriver();
                break;
        }
        System.out.println("\n======> "+webDriver+" Is Selected <======");
        return webDriver;
    }

    public WebDriver getDriver() {
        if (webDriver == null) webDriver = createDriver();
        return webDriver;
    }

    public void closeDriver() {
        webDriver.close();
        webDriver.quit();
    }



}
