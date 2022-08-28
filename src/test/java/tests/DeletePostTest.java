package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyDiaryPage;
import pages.PostPage;

public class DeletePostTest {

    @Test
    public void deletePostTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD);
        PostPage postPage = new PostPage();
        postPage.openPostPage().sendUpdate();
        MyDiaryPage myDiaryPage = new MyDiaryPage();
        myDiaryPage.openMyDiaryPage().deletePost();
        String notificationMessage = myDiaryPage.getNotificationMessage();
        Assert.assertEquals(notificationMessage, "Your post was deleted. It may take a minute or so to update the feeds", "Message wasn't deleted");
    }
}
