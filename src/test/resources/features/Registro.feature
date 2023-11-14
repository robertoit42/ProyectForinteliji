#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion

Feature: Registro en la pagina Booking

@Login
Scenario Outline: scenario description
	Given abrir el navegador 
    And llenar campo usuario<username> y password<password>


    Examples:
    |username||password|
    |Admin||admin123|

