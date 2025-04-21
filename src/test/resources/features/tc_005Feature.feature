Feature: Validar Cambio de Nombre de Columna 'Monto Acumulado Folio OPC'

  Scenario: Exportar Excel con datos actualizados y confirmar renombre de columna
    Given el usuario ha accedido a la opción para exportar datos a Excel
    When el usuario exporta el Excel con los datos actualizados
    Then el archivo se genera correctamente

    When el usuario revisa el archivo Excel exportado
    Then la columna 'Monto Acumulado Folio OPC' debe renombrarse a 'Monto Acumulado Folio OPC (2121)'
    And el cambio de nombre debe aplicarse sin alterar los datos existentes