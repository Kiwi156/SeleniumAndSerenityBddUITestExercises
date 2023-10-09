package pageobjects;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/basic-checkbox-demo.html")
public class CheckBoxForm extends SeleniumEasyForm {
    public void setAgeSelected() {
        $("#isAgeSelected").click();
    }

    public String ageText() {
        return $("#txtAge").getText();
    }
}
