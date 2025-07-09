  #Author: Anais - Jhon
    #Language: es
    #Caso de prueba 2: Registrar usuario existente

  Feature: Prevención de Cuentas Duplicadas
  Como un usuario de Automation Exercise
  Quiero recibir una advertencia si intento registrarme con un correo electrónico ya existente
  Para evitar la creación duplicada de cuentas y proteger la integridad de mis datos

    Scenario: Intento de registro con un correo electrónico ya registrado
      background:
      Given que estoy en la pagina de inicio de Automation Exercise
      When intento registrarme con el nombre "Ana Isabel Patiño Osorio" y el email existente "anai.patino@udea.edu.co"
      Then veo el mensaje de error Email Address already exist!