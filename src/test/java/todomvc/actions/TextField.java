package todomvc.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.List;

public class TextField extends UIInteractions {

    @Step("Adding item {0}")
    public void addItem(String item) {
        $(".new-todo").typeAndEnter(item);
    }

    public List<String> items() {
        return $$(".todo-list label").texts();
    }



    @Step("Open the application")
    public void openApplication() {
        openUrl("https://todomvc.com/examples/angularjs_require/");
    }


  //  public void addItems(String... items) {
    //    for (String item : items) {
      //      addItem(item);

       // }
    public void addItems(String...items){
        for (String item : items) {
            addItem(item);

        }
            
        }



    @Step("Complete item {0} and {1}")
    public void completeAItem(String item) {
        $("//label[.='{0}']/preceding-sibling::input[@type='checkbox']",item).click();
    }

    @Step("Filter by {0} and {1}")
    public void filterBy(String filterName) {
        $("//ul[@class='filters']//a[.='{0}']", filterName).click();
    }
    @Step("Delete item {0}")
    public void deleteAnItem(String item) {
       $("//label[.='{0}']",item).click();
       $("//label[.='{0}']//following-sibling::button[@class='destroy']",item).click();
    }

    }




