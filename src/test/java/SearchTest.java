//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selectors.byName;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//public class SearchTest {
//
//    @Test
//    void selenideSearchTest() {
//        open("https://www.google.com/");
//
//        $(byName("q")).setValue("Selenide").pressEnter();
//
//        $("#serch").shouldHave(text("selenide.org"));
//
//        open("https://www.google.com/");
//
//    }
//
//}
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");

        $(byName("q")).setValue("Selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }
}