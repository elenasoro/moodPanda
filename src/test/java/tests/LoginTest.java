package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        boolean isMainPageDisplayed = loginPage.
                login(Credentials.EMAIL, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        Assert.assertTrue(isMainPageDisplayed, "User is not logged in");
    }
}
