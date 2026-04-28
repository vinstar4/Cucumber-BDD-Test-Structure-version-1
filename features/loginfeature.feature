Feature: login basics

  Scenario: successful login
    Given when user navigates to website
    And enters login details (username: "abc251@gmail.com",password: "abc251@gmail.com")
    And user clicks on login
    Then login should be successful
