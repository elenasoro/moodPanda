package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }
}
