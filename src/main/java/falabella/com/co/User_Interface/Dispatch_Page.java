package falabella.com.co.User_Interface;

import net.serenitybdd.screenplay.targets.Target;

public class Dispatch_Page {

    public static final Target LSTRegion = Target.the("Selecciona la Region").
            locatedBy("//select[@id='region']");

    public static final Target SLCRegion = Target.the("Escoge el departamento deseado").
            locatedBy("//*[//*[@id='region']//child::text() and text()='{0}']");

    public static final Target LSTCity = Target.the("Selecciona la ciudad").
            locatedBy("//select[@id='ciudad']");

    public static final Target SLCCity = Target.the("Escoge la ciudad deseada").
            locatedBy("//*[//*[@id='ciudad']//child::text() and text()='{0}']");

    public static final Target LSTNeighborhood = Target.the("Select de barrio").
            locatedBy("//select[@id='comuna']");

    public static final Target SLCNeighborhood = Target.the("Escoge el barrio deseado").
            locatedBy("//*[@id=\"comuna\"]/option[2]");

    public static final Target NextAddress = Target.the("Escoge el barrio deseado").
            locatedBy("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button");

    public static final Target LBLAddress = Target.the("Lbl de direccion").
            locatedBy("//input[@id='address']");

    public static final Target LBLNeighborhood = Target.the("lbl de interior").
            locatedBy("//input[@id='departmentNumber']");

    public static final Target BTNAddAddress = Target.the("Agregar direccion").
            locatedBy("//*[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");

    public static final Target BTNContinueToBuy = Target.the("BTN de continuar al pago").
            locatedBy("//button[contains(text(),'Continuar')]");

}
