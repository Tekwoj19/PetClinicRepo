package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Waits;

public class OwnerDataPage {

    @FindBy(id = "firstName")
    private WebElement firstNameLabel;
    @FindBy(id = "lastName") ////input[@id='lastName']
    private WebElement findOwnerByLastNameSearch;
    @FindBy(id = "address")
    private WebElement addressLabel;
    @FindBy(id = "city")
    private WebElement cityLabel;
    @FindBy(id = "telephone")
    private WebElement telephoneLabel;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addOwnerButton;

    private WebDriver driver;
    private Waits waits;

    public OwnerDataPage (WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver, this);
    }




    public void inputOwnersDataAndAddOwner(String firstName, String lastName,
                                           String address, String city, String telephoneNumber) {
        //waits.waitForElementToBeVisible(firstNameLabel);
        firstNameLabel.sendKeys(firstName);
        findOwnerByLastNameSearch.sendKeys(lastName);
        addressLabel.sendKeys(address);
        cityLabel.sendKeys(city);
        telephoneLabel.sendKeys(telephoneNumber);
        addOwnerButton.click();

    }


}
