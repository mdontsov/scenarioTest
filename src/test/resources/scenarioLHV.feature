@start
Feature: Leasing application attempt

  Scenario: Fill the first page of leasing application form following the rules

    Given webpage is opened
    And leasing form is displayed
    And button Proceed is disabled
    Then user applies for leasing
    And user selects leasing type
    When user inputs vehicle price of 5000
    Then user makes VAT selection
    And user inputs initial Downpayment percent of 15
    Then user selects lease period years
    And user selects lease period months
    When user inputs the Residual value percent or sum
    And user selects the payment date
    Then button Proceed is enabled
