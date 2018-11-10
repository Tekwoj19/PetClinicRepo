import PageObject.*;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverMyCreators;
import utils.WebDriverMyProvider;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(DataProviderRunner.class)
public class addingAndFindingOwnerWithDdt {
    private static final String URL = "" +
            "http://localhost:8080/";


    private WebDriver driver;
    private HomePage homePage;
    private FindOwnersPage findOwnersPage;
    private OwnerInformationPage ownerInformationPage;
    private OwnerDataPage ownerDataPage;
    private OwnersPage ownersPage;


    /* Instead of String[] we can use Object[] or other type. */
    @DataProvider
    public static Object[][] testDataForOwnerDetailsInput() {
        return new String[][]{
                new String[]{"Tomek", "Testowy12344242", "ul.Zielona", "Opole", "517342455"},
                new String[]{"Zenek", "Nosowski", "ul.Niebieska", "Krakow", "516789234"},
                new String[]{"Pawel", "Kurek", "ul.Zolta", "Warszawa", "517342455"},
                new String[]{"Ariel", "Dzieciol", "ul.Jasna", "Sulejowek", "517342455"},
                new String[]{"Jurek", "Bury", "ul.Nowa", "Czestochowa", "517342455"},
                new String[]{"Aleksander", "Nowy", "ul.Zielona", "Inowroclaw", "517342455"},
                new String[]{"Jerzy", "Wielki", "ul.Wielka", "Gdansk", "517342455"},
                new String[]{"Marek", "Dobry", "ul.Smieszna", "Olsztyn", "517342455"},
                new String[]{"Julian", "Tela", "ul.Mila", "Pszczolki", "517342455"},
                new String[]{"Michal", "Bak", "ul.Dluga", "Opole", "517342455"},


        };
    }

    @Before
    public void setUp() {
        driver = new WebDriverMyProvider(WebDriverMyCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);
        findOwnersPage = PageFactory.initElements(driver, FindOwnersPage.class);
        ownerDataPage = PageFactory.initElements(driver, OwnerDataPage.class);
        ownerInformationPage = PageFactory.initElements(driver, OwnerInformationPage.class);
        ownersPage = PageFactory.initElements(driver, OwnersPage.class);

        driver.get(URL);
    }


    @Test
    @UseDataProvider("testDataForOwnerDetailsInput")

    public void addOwnerWithDdtAndFindAddedOwnerTest(String firstName, String lastName,
                                                     String address, String city, String telephoneNumber) {
        homePage.FindOwnersButtonOnHomePage();
        findOwnersPage.clickAddOwnerButton();
        ownerDataPage.inputOwnersDataAndAddOwner(firstName, lastName,
                address, city, telephoneNumber);
        String owner = firstName + " " + lastName;
        Assertions.assertThat(ownerInformationPage.getTextFromCreatedOwnerNameAndSurname())
                .as(" Added Owner's first and last name not correct").isEqualTo(owner);// checks if owner has been created//
        homePage.FindOwnersButtonOnHomePage();//finds the owner
        String ownersLastName = lastName;
        findOwnersPage.typeInOwnersLastname(ownersLastName);
        findOwnersPage.clickFindOwnerButton();
        if (ownersPage.getTextFromOwnersHeader().equals("Owners")) { //checks if there are more than one owners with the same name
            Assertions.assertThat(ownersPage.getTextFromOwnersLastNameWhenThereISmoreThanOneWithTheSameName())
                    .as(" Searched Owner's first and last name not correct").containsIgnoringCase(ownersLastName);
        } else if (ownerInformationPage.getTexFromownerInfoHeader().equals("Owner Information")) {//checks if owner has the unique surname

            Assertions.assertThat(ownerInformationPage.getTextFromSearchedOwnerNameAndSurname())
                    .as(" Searched Owner's first and last name not correct").isEqualTo(owner);
        }
    }
}
























