package com.gits.ContactListApp.pages;
import com.gits.ContactListApp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Page extends BasePage {
    public SignUp_Page(WebDriver driver){super(driver);}

    //header
    @FindBy(css = "body > div.main-content > p:nth-child(4)")
    public WebElement Signup_Box_Header;
    public WebElement getSignup_Box_Header(){return Signup_Box_Header;}

    //signup button
    @FindBy(css = "#signup")
    public WebElement Signup_Button;
    public WebElement getSignup_Button(){return Signup_Button;}

    //signup page header
    @FindBy(css = "body > div > h1")
    public WebElement Signup_Page_Header;
    public WebElement getSignup_Page_Header(){return Signup_Page_Header;}

    //paragraph
    @FindBy(css = "body > div > p:nth-child(2)")
    public WebElement SignUp_Page_Paragraph;
    public WebElement getSignUp_Page_Paragraph(){return SignUp_Page_Paragraph;}

    //input first name
    @FindBy(css = "#firstName")
    public WebElement InputFirstName;
    public WebElement getInputFirstName(){return InputFirstName;}

    //input last name
    @FindBy(css = "#lastName")
    public WebElement InputLastName;
    public WebElement getInputLastName(){return InputLastName;}

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


    //cancel button
    @FindBy(css = "#cancel")
    public WebElement CancelButton;
    public WebElement getCancelButton(){return CancelButton;}

}
