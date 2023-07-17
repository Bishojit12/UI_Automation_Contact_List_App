package com.gits.ContactListApp.testcases;
import com.gits.ContactListApp.configuration.BaseTest;
import com.gits.ContactListApp.pages.LogIn_Page;
import com.gits.ContactListApp.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn_Page_Validation extends BaseTest {
    @Test

    public void LogIn_Page_Validation() {
        LogIn_Page lip = new LogIn_Page(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");

        //Header Validation
        if (lip.LogIn_Page_Header.isDisplayed()) {
            String LogInPageHeader = lip.LogIn_Page_Header.getText();
            Assert.assertTrue(true, LogInPageHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        //Paragraph 1 Validation
        if (lip.LogIn_Page_Paragraph1.isDisplayed()) {
            String LogInPageParagraph1 = lip.LogIn_Page_Paragraph1.getText();
            Assert.assertTrue(true, LogInPageParagraph1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        //Paragraph 2 Validation
        if (lip.LogIn_Page_Paragraph2.isDisplayed()) {
            String LogInPageParagraph2 = lip.LogIn_Page_Paragraph2.getText();
            Assert.assertTrue(true, LogInPageParagraph2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        //Paragraph 3 Validation
        if (lip.LogIn_Page_Paragraph3.isDisplayed()) {
            String LogInPageParagraph3 = lip.LogIn_Page_Paragraph3.getText();
            Assert.assertTrue(true, LogInPageParagraph3);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        //Sending Values

        //Input Email
        lip.Input_Email.sendKeys(Data.EMAIL);
        sleepTime(2000);

        //Input Password
        lip.Input_Password.sendKeys(Data.PASSWORD);
        sleepTime(2000);

        //Click Submit Button
        lip.Submit_Button.click();
        sleepTime(2000);

        //Back to Login Page
        driver.navigate().back();
        sleepTime(2000);

    }

}
