package todomvc;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todomvc.actions.TextField;



@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingTasks {
    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    @Steps
    TextField textField;

  //  @Before
  //  public void openApplication(){
    //    textField.openApplication();
   // }

    @Test
    public void addingASingleTask(){

        textField.openApplication();

        textField.addItem("Pick up groceries");

        assertThat(textField.items()).contains("Pick up groceries");

    }
    @Test
    public void addingMultipleTasks(){

        textField.openApplication();

        textField.addItems("Fold the laundry","Make Brunch");

        assertThat(textField.items()).contains("Fold the laundry","Make Brunch");
    }
}
