package checkEl;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class checkEl {

    public void clickElement() {
        $(By.xpath("//label[@for='impressiveRadio']")).click();
    }
}



