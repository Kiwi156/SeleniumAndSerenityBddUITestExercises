package paknsave.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchingActions extends UIInteractions {

    @Step("Open the Pak N Save application")
    public void openApplication() {
        openUrl("https://www.paknsave.co.nz/");
    }

    public void addItem(String item) {
        find("//input[@placeholder='Search for groceries e.g. milk...']").typeAndEnter("Tofu");

    }
    public String item() {
        return $("[data-testid='search-header']").getText();
    }
}