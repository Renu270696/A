Feature: To validate the login page

  Scenario: To verify login pagin with invalid credentials
    
    Given user launch browser and in FB page
    When user enter username and password
    And user click login button
    Then  user has to navigate to invalid credentials page

