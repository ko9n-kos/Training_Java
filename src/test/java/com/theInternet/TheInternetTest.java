package com.theInternet;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TheInternetTest {

    URLs urls = new URLs();
    public ElementsCollection homeAboutContactPortfolioGalleryTabs = $$(".example>ul>li>a");
    public ElementsCollection fileDownloadLink = $$(".example>a");
    public SelenideElement chooseFileButton = $("#file-upload");
    public SelenideElement uploadButton = $("#file-submit");
    public SelenideElement uploadConfirmation = $("#uploaded-files");
    public SelenideElement additionalInfo = $("div.example > div:nth-of-type(1) h5");
    public SelenideElement viewProfileLink = $("a[href='/users/1']");
    public SelenideElement profilePage = $("a[href='/users/1']");




    public void openUrl(String url){
        Selenide.open(url);

    }



    @Test
    public void disappearingElementTest (){
        openUrl(urls.disappearingElementsPage);
        int initialCountOfElements = homeAboutContactPortfolioGalleryTabs.size();
        System.out.println(homeAboutContactPortfolioGalleryTabs.last());
        do Selenide.refresh();
        while (initialCountOfElements == homeAboutContactPortfolioGalleryTabs.size());
        System.out.println(homeAboutContactPortfolioGalleryTabs.last());
        Assert.assertEquals(initialCountOfElements,homeAboutContactPortfolioGalleryTabs.size(), "Count of elements is changed");
    }


    @Test
    public void downloadTest () throws FileNotFoundException {
        openUrl(urls.fileDownloadPage);
        File file = fileDownloadLink.last().download();
        System.out.println("Path to file: " + file.getPath());
        if (file != null) {
            file.delete();
        } else Assert.fail("Failed");
    }


    @Test
    public void uploadTest(){
        openUrl(urls.fileUploadPage);
        chooseFileButton.setValue("C:\\Users\\KonstantinSTATUTA\\Desktop\\File_X.rtf");
        uploadButton.click();
        Assert.assertTrue(uploadConfirmation.exists());
    }

    @Test
    public void hoversTest(){
        openUrl(urls.hoversPage);
        Assert.assertEquals("name: user1", additionalInfo.should(Condition.visible).innerText());
        viewProfileLink.click();
        Assert.assertTrue(WebDriverRunner.url().contains("users/1"));

    }






}
