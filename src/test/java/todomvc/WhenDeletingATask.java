package todomvc;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todomvc.actions.TextField;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenDeletingATask {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    @Steps
    TextField textField;

    @Test
    public void deletedItemsShouldDisappearFromTheList(){

        textField.openApplication();

        textField.addItems("Fold the laundry", "Make Brunch");

        textField.deleteAnItem("Fold the laundry");

        assertThat(textField.items()).containsExactly("Make Brunch");
    }
}
