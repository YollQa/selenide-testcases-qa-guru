import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenEnterprizePage {
    @Test
    void useHoverForOpenPage () {
        open ("https://github.com/");
        $(".HeaderMenu-item", 1).hover();
        $(byText("Enterprise")).click();
        $("h1").shouldHave(Condition.text("Build like the best"));
    }
}

