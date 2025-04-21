Feature: Validate 'Status Pago Código' column and rename 'Descripción Status Pago'

  Scenario: Validate updated Excel with new and renamed columns
    Given I am on the module page
    When I download the updated Excel file
    Then The document should be generated successfully with all the modifications
    And A new column 'Status Pago Código' should appear to the right of 'Fecha de Pago'
    And The column 'Status de Pago' should be renamed to 'Descripción Status Pago'