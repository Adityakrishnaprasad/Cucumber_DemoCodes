Feature: Verify user can navigate to products listing page

  Scenario: search for existing product
    Given user logged into applictaion
    When user enters "product name" in search field
    And user clicks on search button
    Then user should navigate to that product listing page

  Scenario: search for non-existing product
    Given user logged into applictaion
    When user enters "product name" in search field
    And user clicks on search button
    Then user should see a message like no product found
