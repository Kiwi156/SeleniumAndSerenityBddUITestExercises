package todomvc;

import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todomvc.actions.TextField;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenCompletingMultipleTasks {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    @Steps
    TextField textField;

    @Test
    public void completedTasksShouldNotShowActiveTasks(){

        textField.openApplication();

        textField.addItems("Fold the laundry", "Make Brunch");

        textField.completeAItem("Make Brunch");

        textField.filterBy("Completed");

        assertThat(textField.items()).containsExactly("Make Brunch");

    }

}
