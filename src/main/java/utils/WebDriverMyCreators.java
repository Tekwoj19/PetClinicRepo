package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.Objects;

public class WebDriverMyCreators {
    public static final WebDriverMyCreator CHROME = () -> {
        startChromeDriverServer();
        return (WebDriver) new ChromeDriver();
    };
    private static void startChromeDriverServer() {
        System.setProperty("webdriver.chrome.driver", Objects.requireNonNull(ChromeDriverMyExecutor.getProperDriverExecutable()));
    }
}
