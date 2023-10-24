package paknsave;

import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import paknsave.actions.SearchingActions;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingASingleItem {

    @Managed(driver = "chrome")
    WebDriver driver;

    SearchingActions searchingActions;

   @Test
   public void whenSearchingForAnItem(){

   searchingActions.openApplication();

   searchingActions.addItem("Tofu");

//   assertThat(searchingActions.item()).contains("Tofu");

   }
}
