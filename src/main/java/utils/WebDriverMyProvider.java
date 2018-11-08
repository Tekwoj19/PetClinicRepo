package utils;

import org.openqa.selenium.WebDriver;

public class WebDriverMyProvider {

    private final WebDriver driver;

    public WebDriverMyProvider(WebDriverMyCreator creator) {
        driver = creator.create();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
