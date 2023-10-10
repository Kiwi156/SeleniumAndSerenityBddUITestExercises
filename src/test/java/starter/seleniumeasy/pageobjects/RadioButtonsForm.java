package starter.seleniumeasy.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/basic-radiobutton-demo.html")
public class RadioButtonsForm extends SeleniumEasyForm {
    public void selectOption(String value) {
        inRadioButtonGroup("optradio").selectByValue(value);
    }

    public void getCheckedValue() {
        $("#buttoncheck").click();
    }

    public String getResult() {
        return $(".radiobutton").getText();
    }
}
