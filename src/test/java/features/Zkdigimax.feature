@zkdigimax
Feature: Content Service Application

  login:
  @Customer_01
  Scenario: Verify whether cusomer is able to access URL
    Given I am on landing page of the application

  @Customer_02
  Scenario: Verify customer is able to redirect to Create Account page after clicking on Registration and observe below details
  Given I am on landing page of the application
  Then I click on register button
  Then I verify the registration page
  
  @Customer_03
  Scenario: Verify the data validation for all the fields with negative data
  Given I am on landing page of the application
  Then I click on register button
  Then I verify the field validation
  
  @Customer_04
  Scenario: Verify the data validation for all the fields when user trying to add new account
  Given I am on landing page of the application
  Then I click on register button
  Then I verify the Sucess message

 @Customer_05
 Scenario: Verify whether register page has login link text 
  Given I am on landing page of the application
  Then I click on register button
  Then I verify the login link text is present in register page 
  Then I verify the login page 


  
  

  