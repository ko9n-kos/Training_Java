package com.gmail;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.WebDriverRunner.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private final String e_mailAddress = "login";
    private final String password = "password";


    public void logInGmail (String e_mailAddress, String password){
        Selenide.open("https://mail.ru");
        $("[name='login']").setValue(e_mailAddress);
        $("input.o-control").click();
        $("[name='password']").setValue(password);
        $("input.o-control").click();

    }

    public void areYouLoggedIn() {
        if (url().contains("inbox")) {
            throw new IllegalStateException("Something went wrong");
        }
    }








}
