  #Author: Anais
    #Language: en
    #Caso de prueba 1: Registrar usuario

  Feature: Funcionalidad de registro
  Como usuario nuevo de Automation Exercise
  Quiero registrarme en la plataforma con mi nombre y correo electrónico
  Para poder crear una cuenta y acceder a las funcionalidades del sitio

    Scenario: Registro de un usuario nuevo y eliminación de la cuenta

      Given que estoy en la pagina de inicio de Automation Exercise
      When registro un nuevo usuario con el nombre "Ana Isabel Patiño Osorio" y el email "anai.patino@gmail.com"
      And completo el formulario de registro con todos los datos requeridos
      Then mi cuenta se crea correctamente

      When elimino la cuenta recién creada
      Then veo el mensaje ACCOUNT DELETED!
      And hago clic en el botón Continue para finalizar