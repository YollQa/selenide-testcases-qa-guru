
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnitSearchTest {
    @Test
    void findJUnit5SoftAssertions(){
        //Открытие страницы Selenide в Github
        open("https://github.com/selenide/selenide");
        //Переход в раздел Wiki проекта
        $("#wiki-tab").click();
        //Проверка что в списке Pages есть раздел Soft Assertions и переход на страницу
        $(".wiki-more-pages-link").$("button").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        //Проверка что есть код для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
