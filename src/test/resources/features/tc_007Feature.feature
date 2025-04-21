Feature: Validar Columnas 'IVA exento' e 'IVA retenido'

  Scenario: Exportar el archivo Excel del módulo y validar columnas de IVA
    Given el usuario está en la página principal del módulo
    When el usuario exporta el archivo Excel del módulo
    Then el archivo Excel se genera con los datos actualizados
    And las columnas 'IVA exento' e 'IVA retenido' aparecen con la información correcta