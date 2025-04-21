Feature: Validar Actualización de Campos en Columna 'estado'.

  Scenario: Exportar excel y verificar actualización de la columna 'estado'
    Given el usuario navega a la página de exportación de Excel
    When el usuario realiza la exportación del Excel
    Then el documento se descarga sin inconvenientes
    And el usuario verifica que la columna 'estado' se actualice con los datos correctos
    Then los datos en la columna 'estado' son conformes a las especificaciones de la historia