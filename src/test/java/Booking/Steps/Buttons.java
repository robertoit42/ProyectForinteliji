package Booking.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Buttons {
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement botonLogin;

    //@FindBy(how = How.XPATH,using = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    //private WebElement botonAdmin;

    @FindBy(how = How.XPATH,using = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    private WebElement botonAdmin;


    public Buttons(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void buttonLogin() {

        botonLogin.click();
    }

    public void buttonAdminpage() {
     botonAdmin.click();
    }
}
