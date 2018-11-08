package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waits;


public class FindOwnersPage {

    private WebDriver driver;
    private Waits waits;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement ownersLastNameLabel;
    @FindBy(xpath = "//div[@class = 'col-sm-offset-2 col-sm-10']//button[contains(text(),'Owner')]")
    private WebElement findOwnerButton;
    @FindBy(xpath = "//a[@class = 'btn btn-default']")
    private WebElement addOwnerButton;

    public FindOwnersPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
        // Remember to use this! If you use PageObject.HomePage.class you will get memory leak!
        PageFactory.initElements(driver, this);
    }


    public void LastNameLabel() {
        ownersLastNameLabel.click();
    }

    public void typeInOwnersLastname(String ownersLastName) {
        waits.waitForElementToBeClickable(ownersLastNameLabel);
        ownersLastNameLabel.sendKeys(ownersLastName);
    }

    public void clickFindOwnerButton() {
        findOwnerButton.click();
    }

    public void clickAddOwnerButton() {
        waits.waitForElementToBeClickable(addOwnerButton);
        addOwnerButton.click();
    }


}




