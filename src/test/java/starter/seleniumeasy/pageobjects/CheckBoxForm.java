package starter.seleniumeasy.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/basic-checkbox-demo.html")
public class CheckBoxForm extends SeleniumEasyForm {
    public void setAgeSelected() {
        $("#isAgeSelected").click();
    }

    public String ageText() {
        return $("#txtAge").getText();
    }

    public boolean optionIsCheckedFor(String option) {
       return  $("//label[contains(.,'{0}')]/input", option).isSelected();
    }

    public void checkAll() {
        $("//input[@value='Check All']").click();
    }
}

