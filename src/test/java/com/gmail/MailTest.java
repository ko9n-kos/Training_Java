package com.gmail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class MailTest {

    @Test
    @Parameters({"login", "password"})
    public void testLogin(String login, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.logInGmail(login,password);
        loginPage.areYouLoggedIn();
    }


    @Test
    @Parameters({"expectedCountOfLetters", "login", "password"})
    public void testCountOfLetters(int expectedCountOfLetters, String login, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.logInGmail(login,password);
        GmailBoxPage inbox = new GmailBoxPage();
        Assert.assertNotEquals(expectedCountOfLetters,inbox.countOfLetters());

    }


    @Test(dataProvider = "emailsProvider", dataProviderClass = GmailDP.class)
    @Parameters({"login", "password"})
    public void sendMultipleEmails(String email, String login, String password){
//        System.out.println(email);
        LoginPage loginPage = new LoginPage();
        loginPage.logInGmail(login,password);
        GmailBoxPage gmailBoxPage = new GmailBoxPage();
        gmailBoxPage.sendEmails(email);
        //gmailBoxPage.checkThatEmailSent();
    }


    @AfterMethod
    public void endOfTest(){
        GmailBoxPage out = new GmailBoxPage();
        out.logOut();
    }







}
