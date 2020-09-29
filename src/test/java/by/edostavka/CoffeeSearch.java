package by.edostavka;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.WebDriverRunner.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CoffeeSearch {

    @Test
    @Parameters({"expectedUrl"})
    public void searchCoffeeProduct(String expectedUrl){
        open("https://e-dostavka.by");
        $("div.main_menu__inner > nav .fa").click();
        $("#searchtext").setValue("Кофе натуральный молотый «Barista Mio» 100% арабика, 250").pressEnter();
        $("[alt='Кофе натуральный молотый «Barista Mio» 100% арабика, 250 г.']").click();
        Assert.assertEquals(url(), expectedUrl);


    }
}
