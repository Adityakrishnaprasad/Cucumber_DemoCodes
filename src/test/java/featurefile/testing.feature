Feature: login functionality

  Background: 
    Given user opens the browser
    When user hit the url of application
    Then login page appears

  @RegressionTest
  Scenario: Login as super admin
    Given user in login page
    When user login into application with  "superadmin@amazon.com" and password 123456
    Then home page should be displayed
    And user should be able to access the application

  @SanityTest
  Scenario: Login as user
    Given user in login page
    When user login into application with  "smith@amazon.com" and password 123456
    Then home page should be displayed
    And user should be able to access the application

  @RegressionTest @SmokeTest
  Scenario Outline: Login as user
    Given user in login page
    When user login into application with  <un> and password <pwd>
    Then home page should be displayed
    And user should be able to access the application

    Examples: 
      | un                | pwd    |
      | akp1999@gmail.com | Akp123 |
      | arp1971@gmail.com | Arp123 |
      | abh1942@gmail.com | Abh123 |

  @SmokeTest
  Scenario: user page default signup
    Given user is in practice landing page
    When user signup into application
      | kittu            |
      | k                |
      | kittuk@gmail.com |
      |       9998887771 |
    Then home page should be displayed
    And user should be able to access the application
/*