package tests;

import com.github.javafaker.Faker;
import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditProfilePage;
import pages.LoginPage;

public class EditProfileTest {

    @Test
    public void editFirstName() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD);
        EditProfilePage editProfilePage = new EditProfilePage();
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        editProfilePage.openEditProfilePage().clearAndEnterFirstName(firstName).save();
        String firstNameAfterSave = editProfilePage.getCurrentUserName().substring(0, editProfilePage.getCurrentUserName().length() - 2);
        Assert.assertEquals(firstNameAfterSave, firstName, "First name is incorrect");
    }

    @Test
    public void editLastName() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.EMAIL, Credentials.PASSWORD);
        EditProfilePage editProfilePage = new EditProfilePage();
        Faker faker = new Faker();
        String lastName = faker.lorem().fixedString(1);
        editProfilePage.openEditProfilePage().clearAndEnterLastName(lastName).save();
        String userName = editProfilePage.getCurrentUserName();
        String lastNameAfterSave = String.valueOf(userName.charAt(userName.length() - 1));
        Assert.assertEquals(lastNameAfterSave, lastName, "Last name is incorrect");
    }
}
