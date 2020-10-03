package com.gmail;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.Integer.parseInt;

public class GmailBoxPage {

    protected final String selectAll = "span.button2_select-all > .button2__wrapper";
    protected final String totalCount = "span.button2_select-all .button2__txt";
    protected final String compose = ".compose-button__txt";
    protected final String to = "input[tabindex='100']";
    protected final String textArea = "cke_editable";
    protected final String message = "Test message";
    protected final String send = "span[tabindex='570'] > .button2__txt";
    protected final String logOutLink = "#PH_logoutLink";
    protected final String confirmationWindow = ".layer__link";
    protected final String closeWindow = "path[d='M7.983 6.455l4.34-4.34a1.105 1.105 0 011.562 1.562l-4.34 4.34 4.34 4.34a1.08 1.08 0 11-1.528 1.528l-4.34-4.34-4.34 4.34a1.105 1.105 0 01-1.562-1.562l4.34-4.34-4.34-4.34a1.08 1.08 0 111.528-1.528l4.34 4.34z']";


    public Long countOfLetters() {
        $(selectAll).click();
        String number = $(totalCount).should(Condition.visible).innerText();
        return Long.parseLong(number.trim());
    }


    public void sendEmails(String email){
        $(compose).should(Condition.visible).click();
        $(to).setValue(email).pressEnter();
        $(By.className(textArea)).setValue(message);
        $(send).click();

    }

    public boolean checkThatEmailSent() {
        if ($(confirmationWindow).exists()) {
            throw new IllegalStateException();
        }
        $(closeWindow).click();
        return true;
    }

    public void logOut(){
        $(logOutLink).click();
    }

}
