package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waits;

public class OwnerInformationPage {

    @FindBy(xpath = "//div[@class='container xd-container']//h2[contains(text(),'Owner Information')]")
    private WebElement ownerInfoHeaderText;
    @FindBy(xpath = "//tbody//tr//b[contains(text(),'')]")
    private WebElement createdOwnerNameAndSurnameText;
    @FindBy(xpath = "//a[@class='btn btn-default'][contains(text(),'Owner')]")
    private WebElement editOwnerButtonVisible;
    @FindBy(xpath = "//tbody//b[contains(text(),'')]")
    private WebElement seachedOwnersNameAndSurname;

    private WebDriver driver;
    private Waits waits;

    public OwnerInformationPage (WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);

        // Remember to use this! If you use PageObject.HomePage.class you will get memory leak!
        PageFactory.initElements(driver, this);}

        public String getTextFromCreatedOwnerNameAndSurname () {
            waits.waitForElementToBeVisible(createdOwnerNameAndSurnameText);
            return createdOwnerNameAndSurnameText.getText();


        }
        public String getTextFromEditOwnerButton () {
            waits.waitForElementToBeVisible(editOwnerButtonVisible);
            return editOwnerButtonVisible.getText();


        }
        public String getTextFromSearchedOwnerNameAndSurname () {
            waits.waitForElementToBeVisible(seachedOwnersNameAndSurname);
            return seachedOwnersNameAndSurname.getText();

        }  public String getTexFromownerInfoHeader() {
            waits.waitForElementToBeVisible(ownerInfoHeaderText);
            return ownerInfoHeaderText.getText();

        }

    public void clickEditOWner() {
        waits.waitForElementToBeVisible(editOwnerButtonVisible);
        editOwnerButtonVisible.click();}


}
//div[@class= 'container xd-container']//h2[contains(text(),'Owner')]


//tbody//tr//b[contains(text(),'')]