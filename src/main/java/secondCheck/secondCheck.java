package secondCheck;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.exactText;

public class secondCheck {
    public void firstClick() {
        $(By.xpath("//button[text()='Click Me']")).click();
    }
    public secondCheck textfinder(String text) {
        $("#dynamicClickMessage").shouldHave(exactText(text));
        return this;
    }
    public void secondClick() {
        $(By.xpath("//button[text()='Right Click Me']")).contextClick();
    }
    public secondCheck secondTextfinder(String text) {
        $("#rightClickMessage").shouldHave(exactText(text));
        return this;
    }

}
