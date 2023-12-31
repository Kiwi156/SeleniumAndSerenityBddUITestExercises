package starter.seleniumeasy.pageobjects;

import net.serenitybdd.core.pages.WebElementState;
import org.openqa.selenium.By;
import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("http://demo.seleniumeasy.com/bootstrap-modal-demo.html")
public class ModelDialogPage extends SeleniumEasyForm {

    private static final By LAUNCH_MODAL_BUTTON = By.linkText("Launch modal");
    private static final By SAVE_CHANGES_BUTTON = By.linkText("Save changes");

    public void openModal(){
        $(LAUNCH_MODAL_BUTTON).click();
    }
    public WebElementState saveChangesButton() {return $(SAVE_CHANGES_BUTTON);}

    public void saveChanges(){
        find(SAVE_CHANGES_BUTTON).click();

    }
}
