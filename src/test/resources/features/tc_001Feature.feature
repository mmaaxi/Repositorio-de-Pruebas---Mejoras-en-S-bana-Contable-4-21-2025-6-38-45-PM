Feature: Validate Excel Export and Concatenated Key

  Scenario: Export Excel and validate concatenated key
    Given I navigate to the Canned Reports Module
    When I select Module Claim > Report Code > Claim Accounting Report
    And I click on 'Submit' and then 'View Log'
    Then the log information related to the request should be displayed
    When I click on 'Add Folio' and 'Download Excel File'
    Then an Excel file should be downloaded with the key modification
    And I verify that column C contains the concatenated key