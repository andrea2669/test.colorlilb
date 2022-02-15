@regresion

  Feature:Verificar el diligenciamiento de la pantalla Block Validation

    yo como usuario quiero ingresar a colorlib para verificar el diligenciamiento de la pantalla block validation
  @scenario1
   Scenario: diligenciamiento exitoso formulario block validation

    Given que Camila abre el navegador ingresa a la url de prueba
    And ingresa usuario
    And ingresa clave
    And clic en boton sing in
    When ingresa al aplicativo
    And busca el formulario block validation
    And diligencia el formulario
    Then verifica que lo diligencio exitosamente

 @scenario2

   Scenario: diligenciamiento fallido formulario block validation

   Given que Camila ingresa al navegador e ingresa a la url de prueba
   And ingresa su usuario
   And ingresa su clave
   And da clic en el boton sing in
   When ingresa al aplicativo de prueba
   And no diligencia todos los campos
   Then verifica que no se pudo validar el formulario

