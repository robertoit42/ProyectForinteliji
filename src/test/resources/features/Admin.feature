

@Regresion

Feature: Registro en la pagina Booking

@Admin
Scenario Outline: scenario description
	Given abrir el navegador
    And llenar campo usuario<username> y password<password>
    And Reach Admin Page
    And Scrolldown<Admin>


    Examples:
    |username||password|Admin|
    |Admin||admin123|CeYau|
