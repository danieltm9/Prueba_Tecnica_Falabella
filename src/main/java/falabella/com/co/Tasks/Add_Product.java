package falabella.com.co.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static falabella.com.co.User_Interface.Product_Page.*;
import static falabella.com.co.User_Interface.Shopping_Bag_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add_Product implements Task{
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(BTNSelectProduct),Click.on(BTNClosePopup),Click.on(BTNAddProduct),Click.on(BTNSeeShoppingBag), Click.on(BTNGoToPay));
    }

    public static Add_Product FromthePage(){
        return instrumented(Add_Product.class);
    }
}
