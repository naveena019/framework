@login
Feature: Login
  I want to use this template for my feature file

  @login
  Scenario: Login
    Given openbrowser and enter url
    Then enter user name and password
    And user logged in to application
    Then user clicked on sign off
  	Then user loged out from the application

 