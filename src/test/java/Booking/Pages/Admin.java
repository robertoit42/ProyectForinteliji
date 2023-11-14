package Booking.Pages;

import Booking.Steps.Buttons;
import Booking.Steps.Questions;
import org.openqa.selenium.WebDriver;

public class Admin {
    private Buttons buttons;
    private Questions questions;

    //Constructor
    public Admin (WebDriver driver) {
        this.buttons = new Buttons(driver);
        this.questions= new Questions(driver);
    }

    public void reachAdminPage()
    {
        buttons.buttonAdminpage();
    }
    public void Scrolldown(String Admin) {
        questions.Scrolldown(Admin);
    }

}
