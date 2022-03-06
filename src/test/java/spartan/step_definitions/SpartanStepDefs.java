package spartan.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import spartan.utilities.ConfigurationReader;
import spartan.utilities.Driver;

public class SpartanStepDefs {

    @Given("user is on the Spartan Home Page")
    public void user_is_on_the_Spartan_Home_Page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user clicks on any random Spartan and view the data")
    public void user_clicks_on_any_random_Spartan_and_view_the_data() {

    }
}
