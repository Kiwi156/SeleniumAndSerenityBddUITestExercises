package starter.seleniumeasy.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.seleniumeasy.pageobjects.ModelDialogPage;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenWaitingForElements {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    ModelDialogPage modelDialogPage;

    @Test
    public void waitForAModalDialog(){
        modelDialogPage.open();

        modelDialogPage.saveChangesButton().shouldNotBeVisible();

        modelDialogPage.openModal();

        modelDialogPage.saveChangesButton().shouldBeVisible();

        modelDialogPage.saveChanges();

        modelDialogPage.saveChangesButton().shouldNotBeVisible();
    }
}
