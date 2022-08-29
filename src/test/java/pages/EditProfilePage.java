package pages;

import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EditProfilePage {
    private SelenideElement firstNameInput = $(By.xpath("//label[contains(text(),'First name')]/following-sibling::div/input"));
    private SelenideElement lastNameInput = $(By.xpath("//label[contains(text(),'Last name initial')]/following-sibling::div/input"));
    private SelenideElement saveButton = $(By.xpath("//button[contains(text(), 'Save identity')]"));
    private SelenideElement userName = $(By.xpath("//div[contains(@class, 'card-content')]//p[1]"));


    public EditProfilePage openEditProfilePage() {
        open(Urls.EDIT_PROFILE_PAGE_URL);
        return this;
    }

    public EditProfilePage clearAndEnterFirstName(String name) {
        firstNameInput.click();
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
        return this;
    }

    public EditProfilePage clearAndEnterLastName(String name) {
        lastNameInput.click();
        lastNameInput.clear();
        lastNameInput.sendKeys(name);
        return this;
    }

    public EditProfilePage save() {
        saveButton.click();
        return this;
    }

    public String getCurrentUserName() {
        return userName.getText();
    }


 }
