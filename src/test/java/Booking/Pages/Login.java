package Booking.Pages;

import Booking.Steps.Buttons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
    //llamado de otra clase
    private Buttons buttons;

    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    private WebElement Inputusername;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    private WebElement Inputpassword;

    public Login(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.buttons= new Buttons(driver);
    }

    public void llenarLogin(String username, String password) {
        Inputusername.sendKeys(username);
        Inputpassword.sendKeys(password);
        buttons.buttonLogin();
    }
}