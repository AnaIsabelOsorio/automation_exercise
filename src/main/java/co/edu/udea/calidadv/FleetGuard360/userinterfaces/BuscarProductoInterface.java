package co.edu.udea.calidadv.FleetGuard360.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarProductoInterface extends PageObject {
    public static final Target PRODUCTS_BUTTON = Target.the("PRODUCTS_BUTTON").locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    public static final Target ALL_PRODUCTS = Target.the("ALL_PRODUCTS").locatedBy("/html/body/section[2]/div/div/div[2]/div/h2");
    public static final Target INPUT = Target.the("INPUT").locatedBy("//*[@id=\"search_product\"]");
    public static final Target SEARCH_BUTTON = Target.the("SEARCH_BUTTON").locatedBy("//*[@id=\"submit_search\"]");
    public static final Target SEARCHED_PRODUCTS = Target.the("SEARCHED_PRODUCTS").locatedBy("/html/body/section[2]/div/div/div[2]/div/h2");

}