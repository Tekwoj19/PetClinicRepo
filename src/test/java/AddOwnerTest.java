//import PageObject.FindOwnersPage;
//import PageObject.HomePage;
//import PageObject.OwnerDataPage;
//import PageObject.OwnerInformationPage;
//import org.assertj.core.api.Assertions;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import utils.WebDriverMyCreators;
//import utils.WebDriverMyProvider;
//
//import java.io.IOException;
//
//public class AddOwnerTest {
//
//    private WebDriver driver;
//    private HomePage homePage;
//    private FindOwnersPage findOwnersPage;
//    private OwnerInformationPage ownerInformationPage;
//    private OwnerDataPage ownerDataPage;
//    private static final String URL = "http://localhost:8080/";
//
//    @Before
//    public void setUp() {
//        driver = new WebDriverMyProvider(WebDriverMyCreators.CHROME).getDriver();
//        driver.manage().window().maximize();
//        homePage=new HomePage(driver);
//        findOwnersPage = new FindOwnersPage(driver);
//        ownerDataPage =new OwnerDataPage(driver);
//        ownerDataPage= new OwnerDataPage(driver);
//        driver.get(URL);
//
//    }
//    @After
//    public void tearDown() {
//        driver.close();
//    }
//
////    @Test
////    public void () throws IOException {
//
////        String firstName="Tomek";
////        String lastName= "Kowalski";
////        String address = "ul.Nowa"
////        String city =
////        String telephoneNumber
//
//
////        findOwnersPage.clickAddOwnerButton();
////        ownerDataPage.inputOwnersDataAndAddOwner(String firstName, String lastName,
////                String address, String city, String telephoneNumber);
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//}
