package pages;

import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PostPage {
    private SelenideElement noReasonButton = $(By.xpath("//button[contains(text(), 'no reason')]"));
    private SelenideElement updateButton = $(By.xpath("//a[contains(text(), 'Update to')]"));


    public PostPage openPostPage() {
        open(Urls.POST_PAGE_URL);
        return this;
    }

    public PostPage sendUpdate() {
        noReasonButton.click();
        updateButton.click();
        return this;
    }

}
