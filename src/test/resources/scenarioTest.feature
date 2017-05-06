Feature: Search with Google

  @end
  Scenario: Make search request

    Given Google webpage is opened
    And search criteria is entered
    Then Enter key is pressed
    When search results are displayed
    Then search criteria result is listed first