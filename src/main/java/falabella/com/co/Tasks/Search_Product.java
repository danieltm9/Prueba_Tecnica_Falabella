package falabella.com.co.Tasks;

import io.cucumber.datatable.DataTable;
import static falabella.com.co.User_Interface.Falabella_Index_Page.LblSearchProduct;
import static falabella.com.co.User_Interface.Falabella_Index_Page.BTNSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search_Product implements Task {

    List<String> information;
    public Search_Product(DataTable information){
        this.information=information.asList();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LblSearchProduct),
                Enter.theValue(information.get(0)).into(LblSearchProduct),
                Click.on(BTNSearch));
    }

    public static Search_Product FromthePage(DataTable information){
        return instrumented(Search_Product.class,information);
    }

}
