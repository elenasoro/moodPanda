package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SendHugTest {

    @Test
    public void sendHugTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD);
        HomePage homePage = new HomePage();
        String hugButtonText = homePage.openHomePage().sendHug().getHugButtonText();
        Assert.assertEquals(hugButtonText, "Hug sent", "Hug was not sent");
    }
}
