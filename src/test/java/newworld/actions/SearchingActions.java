package newworld.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import org.openqa.selenium.By;

public class SearchingActions extends UIInteractions {

    @Step("Open the NewWorld application")
    public void openApplication() {
        openUrl("https://www.newworld.co.nz/");
    }

    public void AddItem(String item) {
        find("//input[@placeholder='Search for groceries e.g. milk...']").typeAndEnter("Jam");

    }

    //public String item() {
      //  return $(".data-testid").getText();
    }


