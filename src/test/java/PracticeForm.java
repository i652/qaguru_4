import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    @Test
    void selenideFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("First Name");
        $("#lastName").setValue("Last Name");
        $("#userEmail").setValue("name@example.com");
        $(byText("Female")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select option[value='6']").click();
        sleep(1000);
        $(".react-datepicker__year-select option[value='1991']").click();
        sleep(1000);
        $(".react-datepicker__day.react-datepicker__day--018").click();
        sleep(1000);
        $("#subjectsContainer").click();
        sleep(1000);
        $("#subjectsInput").setValue("En");
        sleep(1000);
        $("#subjectsInput").pressEnter();
        sleep(1000);
        $("#subjectsInput").append("Co").pressEnter();
        sleep(1000);
        $(byText("Sports")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue("Some current address");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        sleep(1000);
        File file = new File("IMG_4410.jpg");
        $("#uploadPicture").uploadFile(file);
        sleep(1000);
        $(byText("Submit")).click();
        sleep(3000);
    }
}
