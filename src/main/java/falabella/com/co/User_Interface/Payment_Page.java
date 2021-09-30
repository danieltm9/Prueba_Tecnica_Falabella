package falabella.com.co.User_Interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Payment_Page {

    public static final Target PaymentMethod = Target.the("Metodo de pago").located(By.xpath("/html/body/div[3]/div[2]/div/div/section/div/h2"));
    public static Target getPayment_Method() {return PaymentMethod;}

}
