package newworld;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import newworld.actions.SearchingActions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingASingleItem {

    @Managed(driver = "chrome")
    WebDriver driver;

    SearchingActions searchingActions;

    @Test
    public void whenSearchingOnAnItem(){

        searchingActions.openApplication();

        searchingActions.AddItem("Jam");

      //  assertThat(searchingActions.item()).containsAnyOf("Jam");
    }

}
