#Autor: evegaf@choucairtesting.com

@informe
  Feature: Se realizara una busqueda del informe del sector Petroleo de  mayor 2021

    @pruebaUno
    Scenario: Realizamos un robot automatizado para acceder al menu empresa, capital inteligente, actualidad economica, selecicionamos el reporte
       evolucion del contexto macroeconomico y global al inicio 2021 para descargar el informe del sector petroleo mayo 2021.
      Given abrir la pagina de Bancolombia
      When ingreso al menu de empresa, capital inteligente y posterior poder descargar el informe del sector petroleo mayo2021
      Then se verifica que este presente el contrato con nombre informe-sectorial-petroleo-junio-2021.pdf


