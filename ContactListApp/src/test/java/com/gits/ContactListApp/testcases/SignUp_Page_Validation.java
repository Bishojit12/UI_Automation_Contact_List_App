package com.gits.ContactListApp.testcases;
import com.gits.ContactListApp.configuration.BaseTest;
import com.gits.ContactListApp.pages.LogIn_Page;
import com.gits.ContactListApp.pages.SignUp_Page;
import com.gits.ContactListApp.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp_Page_Validation extends BaseTest {
    @Test
    public void SignUp_Page_Validation(){
        LogIn_Page lip=new LogIn_Page(driver);
        SignUp_Page sup=new SignUp_Page(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");


        //Header Validation
        if (sup.getSignup_Box_Header().isDisplayed()) {
            String SignUpBoxHeader = sup.getSignup_Box_Header().getText();
            Assert.assertTrue(true, SignUpBoxHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);


        //Click SignUp Button
        sup.getSignup_Button().click();
        sleepTime(2000);


        //URL Validation
        String BaseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");



        //Header Validation
        if (sup.getSignup_Page_Header().isDisplayed()) {
            String SignUpPageHeader = sup.getSignup_Page_Header().getText();
            Assert.assertTrue(true, SignUpPageHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);



        //Paragraph Validation
        if (sup.getSignUp_Page_Paragraph().isDisplayed()) {
            String SignUp_Page_Paragraph = sup.getSignUp_Page_Paragraph().getText();
            Assert.assertTrue(true,SignUp_Page_Paragraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);


        //Sending Values

        //Input First Name
        sup.getInputFirstName().sendKeys(Data.FIRST_NAME);
        sleepTime(2000);


        //Input Last Name
        sup.getInputLastName().sendKeys(Data.LAST_NAME);
        sleepTime(2000);


        //Input Email
        sup.getInput_Email().sendKeys(Data.INPUT_EMAIL);
        sleepTime(2000);


        //Input Password
        sup.getInput_Password().sendKeys(Data.INPUT_PASSWORD);
        sleepTime(2000);


        //Click Submit Button
        sup.getSubmit_Button().click();
        sleepTime(2000);


        //Back to Add User Page
        driver.navigate().back();
        sleepTime(2000);


        //Click Cancel Button
        sup.getCancelButton().click();
        sleepTime(2000);

    }
}
