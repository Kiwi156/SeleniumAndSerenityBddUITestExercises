package starter.seleniumeasy;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;

import starter.seleniumeasy.actions.FormPage;
import starter.seleniumeasy.actions.NavigateActions;
import starter.seleniumeasy.pageobjects.*;

import java.util.Arrays;
import java.util.List;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenInteractingWithInputForms {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    @Steps
    NavigateActions navigate;

    /**
     * Basic form fields:
     * Test Enters a message and checks that the message is correctly displayed
     * http://demo.seleniumeasy.com/basic-first-form-demo.html
     */

    SingleInputFieldForm singleInputFieldForm;
    @Test
    public void basicForm(){

    navigate.to(FormPage.SingleInputFieldForm);

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
        navigate.to(FormPage.TwoInputFieldForm);
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

        navigate.to(FormPage.CheckBoxForm);
        checkboxform.setAgeSelected();

        assertThat(checkboxform.ageText()).isEqualTo("Success - Check box is checked");


    }

    private static final List<String> ALL_THE_OPTIONS = Arrays.asList("Option 1", "Option 2", "Option 3", "Option 4");
    @Test
    public void multipleCheckboxes(){
        checkboxform.open();

        assertThat(ALL_THE_OPTIONS).allMatch(
                option -> !checkboxform.optionIsCheckedFor(option)
        );

        checkboxform.checkAll();

        assertThat(ALL_THE_OPTIONS).allMatch(
                option -> checkboxform.optionIsCheckedFor(option)
        );

     }

    RadioButtonsForm radioButtonsForm;

    @Test
    public void radioButtons(){

        radioButtonsForm.open();

        radioButtonsForm.selectOption("Female");

        radioButtonsForm.getCheckedValue();

        assertThat(radioButtonsForm.getResult()).isEqualTo("Radio button 'Female' is checked");
    }

    MultipleRadioButtonsForm multipleRadioButtonsForm;
    @Test
    public void multipleRadioButtons(){

        multipleRadioButtonsForm.open();

        multipleRadioButtonsForm.selectGender("Female");
        multipleRadioButtonsForm.selectAgeGroup("15 - 50");
        multipleRadioButtonsForm.getValues();

        assertThat(multipleRadioButtonsForm.getResults()).contains("Sex : Female").contains("Age group: 15 - 50");
    }

   SelectListForm selectListForm;
   @Test
   public void selectList(){
       selectListForm.open();

       assertThat(selectListForm.selectedDay()).isEmpty();

       selectListForm.selectDay("Wednesday");

       assertThat(selectListForm.selectedDay()).isEqualTo("Wednesday");

   }

   MultiSelectListForm multiSelectListForm;
   @Test
    public void multiSelectList(){

    multiSelectListForm.open();

    assertThat(multiSelectListForm.selectStated()).isEmpty();

    multiSelectListForm.selectStates("Florida", "Ohio", "Texas");

    assertThat(multiSelectListForm.selectStated()).containsExactly("Florida", "Ohio", "Texas");
   }
    HoverPage hoverPage;
    @Test
    public void hover() {
        hoverPage.open();

        hoverPage.hoverOverFigure(1);
        hoverPage.captionForFigure(1).shouldBeVisible();
        hoverPage.captionForFigure(1).shouldContainText("user1");

        hoverPage.hoverOverFigure(2);
        hoverPage.captionForFigure(2).shouldBeVisible();
        hoverPage.captionForFigure(2).shouldContainText("user2");
    }

    }
