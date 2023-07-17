package com.gits.ContactListApp.pages;
import com.gits.ContactListApp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Contact_Page extends BasePage {
    public Add_Contact_Page(WebDriver driver){
        super(driver);
    }
    //add contact button
    @FindBy(css = "#add-contact")
    public WebElement AddContactButton;
    public WebElement getAddContactButton(){return AddContactButton;}



    //header
    @FindBy(css = "body > div > header > h1")
    public WebElement Add_Contact_Header;
    public WebElement getAdd_Contact_Header(){return Add_Contact_Header;}


    //logout button
    @FindBy(css = "body > div > header > h1")
    public WebElement LogOutButton;
    public WebElement getLogOutButton(){return LogOutButton;}



    //first name input header
    @FindBy(css = "#add-contact > p:nth-child(1) > label:nth-child(1)")
    public WebElement FirstNameInputHeader;
    public WebElement getFirstNameInputHeader(){return FirstNameInputHeader;}


    //first name input
    @FindBy(css = "#firstName")
    public WebElement InputFirstName;
    public WebElement getInputFirstName(){return InputFirstName;}


    //last name input header
    @FindBy(css = "#add-contact > p:nth-child(1) > label:nth-child(3)")
    public WebElement LastNameInputHeader;
    public WebElement getLastNameInputHeader(){return LastNameInputHeader;}


    //last name input
    @FindBy(css = "#lastName")
    public WebElement InputLastName;
    public WebElement getInputLastName(){return InputLastName;}



    //date of birth header
    @FindBy(css = "#add-contact > p:nth-child(2) > label")
    public WebElement DateOfBirthHeader;
    public WebElement getDateOfBirthHeader(){return DateOfBirthHeader;}


    //input date of birth
    @FindBy(xpath = "//*[@id='birthdate']")
    public WebElement InputDateOfBirth;
    public WebElement getInputDateOfBirth(){return InputDateOfBirth;}



    //input email header
    @FindBy(css = "#add-contact > p:nth-child(3) > label:nth-child(1)")
    public WebElement InputEmailHeader;
    public WebElement getInputEmailHeader(){return InputEmailHeader;}


    //input email
    @FindBy(css = "#email")
    public WebElement InputEmail;
    public WebElement getInputEmail(){return InputEmail;}


    //input phone number header
    @FindBy(css = "#add-contact > p:nth-child(3) > label:nth-child(3)")
    public WebElement InputPhoneNoHeader;
    public WebElement getInputPhoneNoHeader(){return InputPhoneNoHeader;}


    //input phone number
    @FindBy(css = "#phone")
    public WebElement InputPhoneNumber;
    public WebElement getInputPhoneNumber(){return InputPhoneNumber;}



    //street address 1 header
    @FindBy(css = "#add-contact > p:nth-child(4) > label")
    public WebElement StreetAddress1Header;
    public WebElement getStreetAddress1Header(){return StreetAddress1Header;}


    //input street address 1
    @FindBy(css = "#street1")
    public WebElement InputStreetAddress1;
    public WebElement getInputStreetAddress1(){return InputStreetAddress1;}


    //street address 2 header
    @FindBy(css = "#add-contact > p:nth-child(5) > label")
    public WebElement StreetAddress2Header;
    public WebElement getStreetAddress2Header(){return StreetAddress2Header;}


    //input street address 2
    @FindBy(css = "#street2")
    public WebElement InputStreetAddress2;
    public WebElement getInputStreetAddress2(){return InputStreetAddress2;}


    //input city header
    @FindBy(css = "#add-contact > p:nth-child(6) > label:nth-child(1)")
    public WebElement InputCityHeader;
    public WebElement getInputCityHeader(){return InputCityHeader;}


    //input city
    @FindBy(css = "#city")
    public WebElement InputCity;
    public WebElement getInputCity(){return InputCity;}


    //input state header
    @FindBy(css = "#add-contact > p:nth-child(6) > label:nth-child(3)")
    public WebElement InputStateHeader;
    public WebElement getInputStateHeader(){return InputStateHeader;}


    //input state
    @FindBy(css = "#stateProvince")
    public WebElement InputState;
    public WebElement getInputState(){return InputState;}


    //input postal code header
    @FindBy(css = "#add-contact > p:nth-child(7) > label:nth-child(1)")
    public WebElement InputPostalCodeHeader;
    public WebElement getInputPostalCodeHeader(){return InputPostalCodeHeader;}


    //input postal code
    @FindBy(css = "#postalCode")
    public WebElement InputPostalCode;
    public WebElement getInputPostalCode(){return InputPostalCode;}


    //input country header
    @FindBy(css = "#add-contact > p:nth-child(7) > label:nth-child(3)")
    public WebElement InputCountryHeader;
    public WebElement getInputCountryHeader(){return InputCountryHeader;}


    //input country name
    @FindBy(css = "#country")
    public WebElement InputCountryName;
    public WebElement getInputCountryName(){return InputCountryName;}


    //submit button
    @FindBy(css = "#submit")
    public WebElement Submit_Button;
    public WebElement getSubmit_Button(){return Submit_Button;}


    //cancel button
    @FindBy(css = "#cancel")
    public WebElement CancelButton;
    public WebElement getCancelButton(){return CancelButton;}






}
