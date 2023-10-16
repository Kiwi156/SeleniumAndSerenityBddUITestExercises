package todomvc;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todomvc.actions.TextField;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingMultipleTasks {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    TextField textField;

    @BeforeEach
    public void openApp() {
        textField.openApplication();
    }
    @Test
    public void addingMultipleTasks(){

        textField.addItems("Fold the laundry","Make Brunch");

        assertThat(textField.items()).contains("Fold the laundry","Make Brunch");
    }
}
