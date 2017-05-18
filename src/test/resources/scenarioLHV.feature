@start
Feature: Leasing application attempt

  Scenario: Fill the first page of leasing application form following the rules

    Given webpage is opened
    And leasing form is displayed
    And button Proceed is disabled
    Then user applies for Personal leasing
    And user selects Operating lease type
    When user inputs vehicle price of 20000
    Then user makes VAT selection
    And user inputs first Downpayment percent or sum
    Then user selects lease period years
    And user selects lease period months
    When user inputs the Residual value percent or sum
    Then user selects the payment date
    And button Proceed is enabled
