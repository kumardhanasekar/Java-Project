
Feature: Validation of login functionality in facebook application
@sanity
Scenario: Tc01_Validation of login functionality with valid credientials
Given User launch the chrome browser and maximize window
When User launch the facebook application
And User enter the valid username and valid password
And User click the login button
And User Check whether the page navigate to flipkart home page
Then User close the browser
@regression
Scenario Outline: Tc02_Validation of login functionality with invalid credientials
Given User launch the chrome browser and maximize window
When User launch the facebook application
And User enter invalid "<username>" and "<password>"
And User cliks login button
And User check whether error message is displayed
Then User close the browser

Examples:
|username           |password|
|kumar@gmail.com    |selenium|
|ram@gmail.com      |java|


















