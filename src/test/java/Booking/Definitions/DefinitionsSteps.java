package Booking.Definitions;

import Booking.Pages.Admin;
import Booking.Pages.Login;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import Booking.Steps.Conexion;
import io.cucumber.java.en.Given;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Login login = new Login(driver);
	private Admin admin = new Admin(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}

	@And("^llenar campo usuario(.*) y password(.*)$")
	public void llenarDatoslogin(String username, String password){
		this.login = new Login(driver);
		this.login.llenarLogin(username, password);
	}

   @And("^Reach Admin Page$")
   public void reachingAdminpage() {
		this.admin=new Admin(driver);
		this.admin.reachAdminPage();
   }

   @And("^Scrolldown(.*)$")
	public void scrolling(String Admin) {
		this.admin= new Admin(driver);
		this.admin.Scrolldown(Admin);
   }


}