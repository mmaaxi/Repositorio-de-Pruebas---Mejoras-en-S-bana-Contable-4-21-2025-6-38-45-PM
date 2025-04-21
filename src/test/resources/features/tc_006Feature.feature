Feature: Validate the presence of 'IVA 0%' column

  Scenario: Validate 'IVA 0%' column in Excel export
    When I perform an Excel file export
    Then the Excel file should be downloaded successfully
    And the document should display the 'IVA 0%' column with correct amounts