package falabella.com.co.Questions;

import falabella.com.co.User_Interface.Payment_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Payment_Page_Validation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(Payment_Page.getPayment_Method()).viewedBy(actor).asString();
    }

    public static Payment_Page_Validation IsSame() {

        return new Payment_Page_Validation();
    }
}
