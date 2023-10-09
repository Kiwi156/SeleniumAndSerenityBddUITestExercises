package starter.seleniumeasy;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;

import pageobjects.CheckBoxForm;
import pageobjects.SingleInputFieldForm;
import pageobjects.TwoInputFieldForm;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenInteractingWithInputForms {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    /**
     * Basic form fields:
     * Test Enters a message and checks that the message is correctly displayed
     * http://demo.seleniumeasy.com/basic-first-form-demo.html
     */

    SingleInputFieldForm singleInputFieldForm;
    @Test
    public void basicForm(){

    singleInputFieldForm.open();

    singleInputFieldForm.enterMessage("Hi there");

    singleInputFieldForm.showMessage();

    assertThat(singleInputFieldForm.displayedMessage()).isEqualTo("Hi there");

    }

    /**
     * Basic form fields (part 2)
     * Test Enters two values and checks the result
     * http://demo.seleniumeasy.com/basic-first-form-demo.html
     */


    TwoInputFieldForm twoInputFieldForm;
    @Test
    public void basicFormsWithMultipleFields(){
        twoInputFieldForm.open();

        twoInputFieldForm.enterA("2");
        twoInputFieldForm.enterB("3");

        twoInputFieldForm.getTotal();

        assertThat(twoInputFieldForm.displayedTotal()).isEqualTo("5");

    }

    /**
     * Checkboxes
     * Test Checks that a message appears when you click the checkbox
     * http://demo.seleniumeasy.com/basic-checkbox-demo.html
     */

    CheckBoxForm checkboxform;

    @Test
    public void setSingleInputFieldForm(){
        checkboxform.open();

        checkboxform.setAgeSelected();

        assertThat(checkboxform.ageText()).isEqualTo("Success - Check box is checked");


    }



}
