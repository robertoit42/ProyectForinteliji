package Booking.Test;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = { "src/test/resources/features" }, glue = { "Booking.Definitions" })
@CucumberOptions(features = { "src/test/resources/features"  }, glue = {"Booking.Definitions" }, tags = "@Admin")
public class RunnersFeature {

}
