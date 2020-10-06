package com.gmail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class MailTest {

    LoginPage loginPage;
    GmailBoxPage inbox = new GmailBoxPage();


    public MailTest() throws IOException {
        TestData data = DataInitialization.initialization();
        loginPage = new LoginPage(data);
    }

    @BeforeMethod
    public void logIn(){
        loginPage.logInGmail();
    }


    @Test
    public void testLogin() throws IOException {
        Assert.assertTrue(loginPage.areYouLoggedIn());
    }

    @Test
    @Parameters({"expectedCountOfLetters"})
    public void testCountOfLetters(Long expectedCountOfLetters) throws IOException {
        Assert.assertNotEquals(expectedCountOfLetters, inbox.countOfLetters());
    }


    @Test(dataProvider = "emailsProvider", dataProviderClass = GmailDP.class)
    public void sendMultipleEmails(String email) {
        inbox.sendEmails(email);
        Assert.assertTrue(inbox.checkThatEmailSent());
    }


    @AfterMethod
    public void endOfTest(){
        inbox.logOut();
    }

}
