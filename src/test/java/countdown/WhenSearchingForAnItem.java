package countdown;

import countdown.actions.SearchingActions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingForAnItem extends UIInteractions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    SearchingActions searchingActions;
    @Test
    public void whenSearchingOnAnItem(){

    searchingActions.openApplication();

    searchingActions.AddItem("Bread");

    Assertions.assertThat(searchingActions.item()).containsAnyOf("Bread");





    }

}
