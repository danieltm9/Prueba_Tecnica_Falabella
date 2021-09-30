package falabella.com.co.User_Interface;

import net.serenitybdd.screenplay.targets.Target;

public class Product_Page {

    public static final Target BTNAddProduct = Target.the("BTN Agregar a la bolsa").locatedBy("//button[contains(text(),'Agregar a la Bolsa')]");
    public static final Target BTNSelectProduct = Target.the("BTN Seleccionar producto").locatedBy("//body[1]/div[1]/div[1]/div[1]/div[3]/section[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public static final Target BTNClosePopup = Target.the("BTN Cerrar PopUp").locatedBy("/html/body/div[6]/div[2]/div/div[1]");
    public static final Target BTNSeeShoppingBag = Target.the("BTN Ver la bolsa").locatedBy("//a[@id='linkButton']");

}
