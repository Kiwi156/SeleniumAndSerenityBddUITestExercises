package todomvc;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todomvc.actions.TextField;



@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingASingleTask {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    TextField textField;

    @BeforeEach
    public void openApp() {
        textField.openApplication();
    }

    @Test
    public void addingASingleTask(){

        textField.addItem("Pick up groceries");

        assertThat(textField.items()).containsExactly("Pick up groceries");

    }
}
