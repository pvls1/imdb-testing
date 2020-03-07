import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

/**
 * @author Povilas Pupkys
 * @project imdb-testing
 */

public class ImdbTesting {

    @Test(description = "Test imdb search", groups = {"main"})
    public void tc0001() throws Exception {
        open("http://imdb.com");
        $(By.name("q")).setValue("Game of Thrones").pressEnter();
        $(By.xpath("//a[contains(text(),'Video Game')]")).click();
        $(By.id("findSubHeader")).shouldHave(Condition.text("Search category: Video Game Titles"));
        $(screenshot(Timestamp.getTimeStamp() + " " + "search_window"));
    }
}
