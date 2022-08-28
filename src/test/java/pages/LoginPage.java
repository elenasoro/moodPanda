package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import constants.Urls;


import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement emailField = $(By.xpath("//input[@type='text']"));
    private SelenideElement passwordField = $(By.xpath("//input[@type='password']"));
    private SelenideElement loginButton = $(By.xpath("//*[@id='app']/div/section/div/div/section/div[3]/div[3]/button"));

    public MainPage login(String email, String password) {
        open(Urls.LOGIN_URL);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        loginButton.click();
        return new MainPage();
    }
}
