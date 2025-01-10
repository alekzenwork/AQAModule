package uiTests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class AnimeGoLoginPageTest extends BaseTest {
    @Test
    public void loginOperationWithBadCredintials(){
        AnimeGoLoginPage animeGoLoginPage = new AnimeGoLoginPage();
        Selenide.open("/login");
        animeGoLoginPage.authOperation("test1@yandex.ru", "qwertyuiop");
        animeGoLoginPage.isErrorMessageDisplayed();
    }
}