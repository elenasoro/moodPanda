package pages;

import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MyDiaryPage {

    private SelenideElement actionButton = $(By.xpath("//div[contains(@class, 'dropdown-trigger')]//a"));
    private SelenideElement deleteButton = $(By.xpath("//a[contains(text(), 'Delete')]"));
    private SelenideElement notification = $(By.xpath("//div[contains(text(), 'Your post was deleted. It may take a minute or so to update the feeds')]"));

    public MyDiaryPage openMyDiaryPage() {
        open(Urls.MYDIARY_PAGE_URL);
        return this;
    }

    public MyDiaryPage deletePost() {
        actionButton.click();
        deleteButton.click();
        return this;
    }

    public String getNotificationMessage() {
        notification.shouldBe(visible, Duration.ofSeconds(10));
        return notification.getText();
    }

}
