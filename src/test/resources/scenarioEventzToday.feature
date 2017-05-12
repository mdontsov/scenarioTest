@start @end
Feature: Search with Google

  Scenario: Make search request

    Given webpage is opened
    When button Discover is clicked
    Then events map is loaded
    And events container is ready to be clicked
    Then specific event container is clicked
    And event content is displayed