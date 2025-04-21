Feature: Validar Creación de Columnas 'Folio Pre solicitud' y 'Folio de Pago'

  Scenario: Exportar archivo Excel y verificar columnas
    Given El usuario ejecuta la exportación del Excel
    When El archivo Excel se genera sin errores
    Then Verificar que las columnas 'Folio Pre solicitud' y 'Folio de Pago' aparecen en las posiciones correctas