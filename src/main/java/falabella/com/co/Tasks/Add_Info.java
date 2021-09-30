package falabella.com.co.Tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static falabella.com.co.User_Interface.Dispatch_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add_Info implements Task {

    List<String> Information;
    public Add_Info(DataTable Information){
        this.Information=Information.asList();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LSTRegion), Click.on(SLCRegion.of(Information.get(0))),
                Click.on(LSTCity), Click.on(SLCCity.of(Information.get(1))),
                Click.on(LSTNeighborhood), Click.on(SLCNeighborhood.of(Information.get(2))),
                Click.on(NextAddress),
                Click.on(LBLAddress), Enter.theValue(Information.get(3)).into(LBLAddress),
                Click.on(LBLNeighborhood),Enter.theValue(Information.get(4)).into(LBLNeighborhood),
                Scroll.to(BTNAddAddress).andAlignToBottom(),
                Click.on(BTNAddAddress),
                Click.on(BTNContinueToBuy));
    }

    public static Add_Info FromthePage(DataTable Information){
        return instrumented(Add_Info.class,Information);
    }
}
