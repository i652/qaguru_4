import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    @Test
    void selenideFormTest() {
        // Открыть demoqa
        open("https://demoqa.com/automation-practice-form");

        // Ввести Selenide в поиск
        $("#firstName").setValue("First Name");
        $("#lastName").setValue("Last Name");
        $("#userEmail").setValue("name@example.com");
        //$("input[type=radio, name='gender-radio-2', value='Female']").click();
        //$(byText("Female")).click();
        //$("#genterWrapper input[value='Female']").click();
        //$("#genterWrapper").$(byText("#female")).click();
        //$("input[type=radio, name='gender-radio-2']").pressEnter();
        //$("#gender-radio-2").selectRadio("#gender-radio-2");
        //$("input[type=radio, value='Female']").$("#gender-radio-2").click();
        $(byText("Female")).click();
        $("#userNumber").setValue("Mobile Number");
        //$("#dateOfBirth").$(byText("11")).click();
        //$("#dateOfBirth").$(byText("Feb")).click();
        //$(".react-datepicker__week")
        //$("#dateOfBirthInput").setValue("11 nov 2017");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select option[value='6']").click();
        sleep(1000);
        $(".react-datepicker__year-select option[value='1991']").click();
        sleep(1000);
        $(".react-datepicker__day.react-datepicker__day--018").click();
        sleep(1000);

        //$("#subjectsContainer").click();
        $("#subjectsContainer").click();
        sleep(1000);
        //actions().moveToElement($("div").$(byText("English"))).click();
        //$("#subjectsInput").setValue("En").pressEnter(); //работает, но добавим ещё
        $("#subjectsInput").setValue("En");
        sleep(1000);
        $("#subjectsInput").pressEnter();
        sleep(1000);
        $("#subjectsInput").append("Co").pressEnter();
        sleep(1000);
        //$(".subjects-auto-complete__multi-value__label").setValue("En");

        $(byText("Sports")).click();
        $(byText("Music")).click();

        //$("#uploadPicture").shouldHave("fdg");
        //$("#uploadPicture input[name='uploadPicture', type=file]").click();
        //$("#uploadPicture").click();
        //$("#hobbies-checkbox-2").click();
        //$("#uploadPicture input").uploadFromClasspath("readme.txt");

        $("#currentAddress").setValue("Some current address");

        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();

        $(byText("Select picture")).click();

        //File file1 = new File("egor/Рабочий стол/IMG_4410.jpg");
        //$("#uploadPicture").uploadFile(file1);
        sleep(1000);
    }
}
