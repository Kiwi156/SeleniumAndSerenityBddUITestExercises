package starter.seleniumeasy.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/basic-radiobutton-demo.html")
public class MultipleRadioButtonsForm extends SeleniumEasyForm {
    public void selectGender(String value) {
        inRadioButtonGroup("gender").selectByValue(value);
    }


    public void selectAgeGroup(String value) {
        inRadioButtonGroup("ageGroup").selectByValue(value);
    }

    public void getValues() {
        $(FormButton.withLabel("Get values")).click();
    }

    public String getResults() {
        return $(".groupradiobutton").getText();
    }
}
