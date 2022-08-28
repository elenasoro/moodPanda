package pages;

import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement hugButton = $(By.xpath("//div[contains(@class,'card')][1]//footer//a[contains(@class,'card-footer-item')][1]"));

    public HomePage openHomePage() {
        open(Urls.HOME_PAGE_URL);
        return this;
    }

    public HomePage sendHug() {
        hugButton.shouldBe(visible, Duration.ofSeconds(5));
        hugButton.click();
        return this;
    }

    public String getHugButtonText() {
        hugButton.shouldHave(attribute("disabled"), Duration.ofSeconds(5));
        return hugButton.getText();
    }



}
