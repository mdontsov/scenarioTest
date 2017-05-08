Feature: Search with Google

  @end
  Scenario: Make search request

    Given Google webpage is opened
    And hotel tallinn is entered
    Then Enter key is pressed
    When search results are displayed
    Then print search results