package starter.seleniumeasy.pageobjects;


import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html")
public class SingleInputFieldForm extends SeleniumEasyForm {
    public void enterMessage(String message) {

        $("#user-message").sendKeys(message);
    }

    public void showMessage() {
        $(FormButton.withLabel("Show Message")).click();
    }

    public String displayedMessage() {
        return $("#display").getText();

    }
}
