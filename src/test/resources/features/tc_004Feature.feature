Feature: Validar Columna 'Monto acumulado Folio Reserva 5401'

Scenario: Verificar exportación y validación de columna 'Monto acumulado Folio Reserva 5401'
  Given La exportación es ejecutada desde el módulo correspondiente
  When Yo verifico la existencia de la columna 'Monto acumulado Folio Reserva 5401'
  Then La columna debe aparecer y su valor debe ser la suma de la reserva acumulada inmediata anterior y el monto de reserva actual