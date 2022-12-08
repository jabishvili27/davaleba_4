
import checkEl.checkEl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.open;


import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import secondCheck.secondCheck;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;



public class task4 {

    public static void main(String[] args) {

        task1();
       // task2();


    }

    private static void task1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        open("https://demoqa.com/");
        SelenideElement task1 = $("div.card-body").$(withText("Elements"));
        task1.scrollTo();
        task1.click();

        SelenideElement button = $("#item-2");
        button.click();

        checkEl checkValue = new checkEl();
        checkValue.clickElement();

        $("#impressiveRadio").shouldBe(Condition.selected);
    }
    private static void task2() {

        open("https://demoqa.com/");

        SelenideElement task2 = $("div.card-body").$(withText("Elements"));
        task2.scrollTo();
        task2.click();

        SelenideElement task2butt = $("#item-4");
        task2butt.scrollTo();
        task2butt.click();

        secondCheck task2che= new secondCheck();
        task2che.firstClick();
        task2che.textfinder("You have done a dynamic click");
        task2che.secondClick();
        task2che.secondTextfinder("You have done a right click");
    }
}
