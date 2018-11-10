package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waits;

public class OwnersPage {


    @FindBy(xpath = "//tbody//tr[1]//a[contains(text(),'')]")
    private WebElement ownersLastNameWhenMoreThanOneWithTheSameLastName;

    @FindBy(xpath = "//tbody//tr[1]//a[contains(text(),'')]")
    private WebElement ownersLastNameWhe;
    @FindBy(xpath = "//h2[contains(text(),'')]")
    private WebElement ownersHeaderText;


    private WebDriver driver;
    private Waits waits;

    public OwnersPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);}

        public String getTextFromOwnersLastNameWhenThereISmoreThanOneWithTheSameName () {
            waits.waitForElementToBeVisible(ownersLastNameWhenMoreThanOneWithTheSameLastName);
            return ownersLastNameWhenMoreThanOneWithTheSameLastName.getText();


        }public String getTextFromOwnersHeader () {
            waits.waitForElementToBeVisible(ownersHeaderText);
            return ownersHeaderText.getText();


        }
    }
