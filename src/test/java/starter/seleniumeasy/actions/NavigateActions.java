package starter.seleniumeasy.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    @Step
    public void to(FormPage formPage){
        openPageNamed(formPage.name());
    }

    }


