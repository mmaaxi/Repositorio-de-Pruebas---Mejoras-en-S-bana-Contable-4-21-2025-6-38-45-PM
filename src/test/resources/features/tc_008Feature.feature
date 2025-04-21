Feature: Validar Actualización de Fórmula en 'Monto Acumulado Folio OPC 2121'

  Scenario: Actualizar fórmula en Excel
    Given el usuario ha exportado el Excel completando todas las modificaciones
    When el usuario revisa la celda con la fórmula actualizada para 'Monto Acumulado Folio OPC 2121'
    Then el documento se genera exitosamente
    And la fórmula se actualiza adecuadamente y realiza la suma con los campos: Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido