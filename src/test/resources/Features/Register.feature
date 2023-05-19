Feature: NopCommerce Register
  Background:
    Given User able to Open Browser
    And Enter an Url


    Scenario: NOpCommerce Valid Register Test
      When User click on Register Link
      And User on Register Page and Verify Register page Title
      Then User Enter Gender, First Name, Last Name, Date of Birthday, Date Of Birthday Month, Date of Birth Year,Email, Company Name, Password and Confirm Password on Register Button
      Then User is on Home Page and Verify Home page Title
      And User close the Browser

