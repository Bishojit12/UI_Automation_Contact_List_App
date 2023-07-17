package com.gits.ContactListApp.testcases;
import com.gits.ContactListApp.configuration.BaseTest;
import com.gits.ContactListApp.pages.Add_Contact_Page;
import com.gits.ContactListApp.pages.LogIn_Page;
import com.gits.ContactListApp.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddContact_Page_Validation extends BaseTest {
 @Test
    public void AddContact_Page_Validation(){

     Add_Contact_Page acp=new Add_Contact_Page(driver);
     LogIn_Page lip=new LogIn_Page(driver);

     //URL Validation
     String baseUrl = driver.getCurrentUrl();
     System.out.println("Given"+baseUrl);
     Assert.assertEquals(baseUrl, Data.BASE_URL);
     System.out.println("Home Page URL is visible");


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

     //URL Validation
     String addContactUrl = driver.getCurrentUrl();
     System.out.println("Given"+baseUrl);
     Assert.assertEquals(baseUrl, Data.BASE_URL);
     System.out.println("Add Contact Page URL is visible");


     //Click Add Contact Button
     acp.getAddContactButton().click();

  //Header Validation
  if (acp.getAdd_Contact_Header().isDisplayed()) {
   String Add_Contact_Header = acp.getAdd_Contact_Header().getText();
   Assert.assertTrue(true, Add_Contact_Header);
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //First Name Header Validation
  if (acp.getFirstNameInputHeader().isDisplayed()) {
   String FirstNameInputHeader = acp.getFirstNameInputHeader().getText();
   Assert.assertTrue(true, FirstNameInputHeader);
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input First Name
  acp.getInputFirstName().sendKeys(Data.ADD_CONTACT_FIRST_NAME);
  sleepTime(2000);


  //Last Name Header Validation
  if (acp.getLastNameInputHeader().isDisplayed()) {
   String LastNameInputHeader = acp.getLastNameInputHeader().getText();
   Assert.assertTrue(true, LastNameInputHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Last Name
  acp.getInputLastName().sendKeys(Data.LAST_NAME);
  sleepTime(2000);


  //Date of Birth Header Validation
  if (acp.getDateOfBirthHeader().isDisplayed()) {
   String DateOfBirthHeader = acp.getDateOfBirthHeader().getText();
   Assert.assertTrue(true, DateOfBirthHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Date of Birth
  acp.getInputDateOfBirth().sendKeys(Data.DATE_OF_BIRTH);
  sleepTime(2000);


  //Email Header Validation
  if (acp.getInputEmailHeader().isDisplayed()) {
   String InputEmailHeader = acp.getInputEmailHeader().getText();
   Assert.assertTrue(true, InputEmailHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Email
  acp.getInputEmail().sendKeys(Data.INPUT_EMAIL);
  sleepTime(2000);


  //Phone Number Header Validation
  if (acp.getInputPhoneNoHeader().isDisplayed()) {
   String InputPhoneNoHeader = acp.getInputPhoneNoHeader().getText();
   Assert.assertTrue(true, InputPhoneNoHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Phone Number
  acp.getInputPhoneNumber().sendKeys(Data.PHONE_NUMBER);
  sleepTime(2000);


  //Street Address 1 Header Validation
  if (acp.getStreetAddress1Header().isDisplayed()) {
   String StreetAddress1Header = acp.getStreetAddress1Header().getText();
   Assert.assertTrue(true, StreetAddress1Header );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Street Address 1
  acp.getInputStreetAddress1().sendKeys(Data.STREET_ADDRESS1);
  sleepTime(2000);


  //Street Address 2 Header Validation
  if (acp.getStreetAddress2Header().isDisplayed()) {
   String StreetAddress2Header = acp.getStreetAddress2Header().getText();
   Assert.assertTrue(true,StreetAddress2Header );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Street Address 2
  acp.getInputStreetAddress2().sendKeys(Data.STREET_ADDRESS2);
  sleepTime(2000);


  //Input City Header Validation
  if (acp.getInputCityHeader().isDisplayed()) {
   String InputCityHeader = acp.getInputCityHeader().getText();
   Assert.assertTrue(true, InputCityHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input City
  acp.getInputCity().sendKeys(Data.CITY);
  sleepTime(2000);


  //State Header Validation
  if (acp.getInputStateHeader().isDisplayed()) {
   String InputStateHeader = acp.getInputStateHeader().getText();
   Assert.assertTrue(true, InputStateHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input State
  acp.getInputState().sendKeys(Data.STATE);
  sleepTime(2000);


  //Postal Code Header Validation
  if (acp.getInputPostalCodeHeader().isDisplayed()) {
   String InputPostalCodeHeader = acp.getInputPostalCodeHeader().getText();
   Assert.assertTrue(true, InputPostalCodeHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Postal Code
  acp.getInputPostalCode().sendKeys(Data.POSTAL_CODE);
  sleepTime(2000);


  //Country Header Validation
  if (acp.getInputCountryHeader().isDisplayed()) {
   String InputCountryHeader = acp.getInputCountryHeader().getText();
   Assert.assertTrue(true, InputCountryHeader );
  } else {
   System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
  }
  sleepTime(2000);


  //Input Country Name
  acp.getInputCountryName().sendKeys(Data.COUNTRY_NAME);
  sleepTime(2000);

  //Click Submit Button
  lip.Submit_Button.click();
  sleepTime(2000);
  
  //Back to Login Page
  driver.navigate().back();
  sleepTime(2000);













 }
}
