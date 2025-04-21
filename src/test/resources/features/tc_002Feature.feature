Feature: Exportar Documento con Validación

  Scenario: Validar Columna 'Estado Código'
    Given el usuario ha exportado el documento Excel
    When verifique que exista la nueva columna 'Estado Código' a la derecha de la columna I
    Then el Excel se exporta correctamente y la columna 'Estado Código' aparece en la posición correcta sin datos erróneos