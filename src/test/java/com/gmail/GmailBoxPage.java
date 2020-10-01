package com.gmail;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.Integer.parseInt;

public class GmailBoxPage {


    public int countOfLetters() {
        $("a[href='/inbox/']").shouldBe(Condition.visible);
        String[] words = ($("a[href='/inbox/']").attr("title")).split(" ");
        return Integer.parseInt(words[1]);
        //return parseInt($("#g_mail_events").innerText());


    }


    public void sendEmails(String email){
        $(".compose-button__txt").click();
        $("input[tabindex='100']").setValue(email).pressEnter();
        $(By.className("cke_editable")).setValue("Test message");
        //$("div.editable-7j5c > div:nth-of-type(1)").setValue("Test message");
        $("span[tabindex='570'] > .button2__txt").click();
        //$("path[d='M7.983 6.455l4.34-4.34a1.105 1.105 0 011.562 1.562l-4.34 4.34 4.34 4.34a1.08 1.08 0 11-1.528 1.528l-4.34-4.34-4.34 4.34a1.105 1.105 0 01-1.562-1.562l4.34-4.34-4.34-4.34a1.08 1.08 0 111.528-1.528l4.34 4.34z']").click();

    }

    public void checkThatEmailSent(){
        if($(".layer__link").exists()){
            $("path[d='M7.983 6.455l4.34-4.34a1.105 1.105 0 011.562 1.562l-4.34 4.34 4.34 4.34a1.08 1.08 0 11-1.528 1.528l-4.34-4.34-4.34 4.34a1.105 1.105 0 01-1.562-1.562l4.34-4.34-4.34-4.34a1.08 1.08 0 111.528-1.528l4.34 4.34z']").click();
            throw new IllegalStateException();
        }
    }

    public void logOut(){
        $("#PH_logoutLink").click();
    }


}
