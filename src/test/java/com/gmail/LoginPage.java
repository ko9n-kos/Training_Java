package com.gmail;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final String URL = "https://mail.ru";
    private final SelenideElement loginInput = $("[name='login']");
    private final SelenideElement submit = $("input.o-control");
    private final SelenideElement passwordInput = $("[name='password']");
    private TestData data;

    public LoginPage(TestData data){
        this.data = data;
    }


    public void logInGmail () {
        Selenide.open(URL);
        loginInput.setValue(data.emailAddress);
        submit.click();
        passwordInput.setValue(data.password);
        submit.click();

    }

    public boolean areYouLoggedIn() {
        if (!url().contains(URL)) {
            throw new IllegalStateException("Something went wrong");
        }
        return true;
    }








}
