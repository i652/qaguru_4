import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
public class theInternet {
    @Test
    void herokuapp() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //actions().moveToElement($("#column-a")).clickAndHold().moveToElement($(byText("B"))).release().perform();
        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        sleep(3000);
    }
}
