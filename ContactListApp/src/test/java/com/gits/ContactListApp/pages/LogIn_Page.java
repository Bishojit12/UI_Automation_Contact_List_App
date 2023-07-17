package com.gits.ContactListApp.pages;

import com.gits.ContactListApp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn_Page extends BasePage {
    public LogIn_Page(WebDriver driver){super(driver);}

   //header
    @FindBy(css = "body > h1")
    public WebElement LogIn_Page_Header;
    public WebElement getLogIn_Page_Header(){return LogIn_Page_Header;}

    //paragraph 1
    @FindBy(css = "body > div:nth-child(2)")
    public WebElement LogIn_Page_Paragraph1;
    public WebElement getLogIn_Page_Paragraph1(){return LogIn_Page_Paragraph1;}

    //paragraph 2
    @FindBy(css = "body > div:nth-child(3)")
    public WebElement LogIn_Page_Paragraph2;
    public WebElement getLogIn_Page_Paragraph2(){return LogIn_Page_Paragraph2;}

    //paragraph 3
    @FindBy(css = "body > div.main-content > p:nth-child(1)")
    public WebElement LogIn_Page_Paragraph3;
    public WebElement getLogIn_Page_Paragraph3(){return LogIn_Page_Paragraph3;}

    //input email
    @FindBy(css = "#email")
    public WebElement Input_Email;
    public WebElement getInput_Email(){return Input_Email;}

    //input password
    @FindBy(css = "#password")
    public WebElement Input_Password;
    public WebElement getInput_Password(){return Input_Password;}

     //submit button
     @FindBy(css = "#submit")
     public WebElement Submit_Button;
    public WebElement getSubmit_Button(){return Submit_Button;}


}
