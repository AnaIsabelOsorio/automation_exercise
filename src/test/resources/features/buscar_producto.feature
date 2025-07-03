#Author: Anais - Jhon
  #Language: es
  #Caso de prueba 3: Buscar producto

  Feature: Búsqueda de Productos
  Como un usuario de Automation Exercise
  Quiero buscar productos en la página correspondiente
  Para poder visualizar los resultados relacionados con mi búsqueda

  Scenario: Buscar un producto en el sitio Automation Exercise
    Given que estoy en la pagina de inicio de Automation Exercise
    When navego a la sección de productos
    And busco el término "Top" en el campo de búsqueda de productos
    Then los productos relacionados son visibles


