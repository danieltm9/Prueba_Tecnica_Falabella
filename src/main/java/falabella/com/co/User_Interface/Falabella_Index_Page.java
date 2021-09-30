package falabella.com.co.User_Interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class Falabella_Index_Page extends PageObject {

    public static final Target LblSearchProduct = Target.the("Buscar producto").locatedBy("//input[@id='testId-SearchBar-Input']");
    public static final Target BTNSearch = Target.the("Boton de busqueda").locatedBy("//header/div[3]/div[1]/div[3]/div[1]/button[1]/img[1]");

}
