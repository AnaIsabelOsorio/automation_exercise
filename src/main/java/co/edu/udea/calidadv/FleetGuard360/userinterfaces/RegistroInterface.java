package co.edu.udea.calidadv.FleetGuard360.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroInterface extends PageObject {
    public static final Target SLIDER_HOME_PAGE = Target.the("SLIDER_HOME_PAGE").locatedBy("//*[@id=\"slider\"]");
    public static final Target SIGNUP_LOGIN_BUTTON = Target.the("SIGNUP_LOGIN_BUTTON").locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    public static final Target NEW_USER_SIGNUP = Target.the("NEW_USER_SIGNUP").locatedBy("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    public static final Target INPUT_NAME = Target.the("INPUT_NAME").locatedBy("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    public static final Target INPUT_EMAIL = Target.the("INPUT_EMAIL").locatedBy("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    public static final Target SIGNUP_BUTTON = Target.the("SIGNUP_BUTTON").locatedBy("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    public static final Target ENTER_ACCOUNT_INFORMATION = Target.the("ENTER_ACCOUNT_INFORMATION").locatedBy("//*[@id=\"form\"]/div/div/div/div/h2/b");

    public static final Target INPUT_TITLE_MR = Target.the("INPUT_TITLE_MR").locatedBy("//*[@id=\"id_gender1\"]");
    public static final Target INPUT_TITLE_MRS = Target.the("INPUT_TITLE_MRS").locatedBy("//*[@id=\"id_gender2\"]");
    public static final Target INPUT_PASSWORD = Target.the("INPUT_PASSWORD").locatedBy("//*[@id=\"password\"]");
    public static final Target SELECT_DAY = Target.the("SELECT_DAY").locatedBy("//*[@id=\"days\"]");
    public static final Target SELECT_MONTH = Target.the("SELECT_MONTH").locatedBy("//*[@id=\"months\"]");
    public static final Target SELECT_YEAR = Target.the("SELECT_YEAR").locatedBy("//*[@id=\"years\"]");
    public static final Target CHECKBOX_NEWSLETTER = Target.the("CHECKBOX_NEWSLETTER").locatedBy("//*[@id=\"newsletter\"]");
    public static final Target CHECKBOX_SPECIALOFFERS = Target.the("CHECKBOX_SPECIALOFFERS").locatedBy("//*[@id=\"optin\"]");

    public static final Target INPUT_FIRST_NAME_ADDRESS = Target.the("INPUT_FIRST_NAME_ADDRESS").locatedBy("//*[@id=\"first_name\"]");
    public static final Target INPUT_LAST_NAME_ADDRESS = Target.the("INPUT_LAST_NAME_ADDRESS").locatedBy("//*[@id=\"last_name\"]");
    public static final Target INPUT_COMPANY_ADDRESS = Target.the("INPUT_COMPANY_ADDRESS").locatedBy("//*[@id=\"company\"]");
    public static final Target INPUT_ADDRESS = Target.the("INPUT_ADDRESS").locatedBy("//*[@id=\"address1\"]");
    public static final Target INPUT_ADDRESS2 = Target.the("INPUT_ADDRESS2").locatedBy("//*[@id=\"address2\"]");
    public static final Target SELECT_COUNTRY_ADDRESS = Target.the("SELECT_COUNTRY_ADDRESS").locatedBy("//*[@id=\"country\"]");
    public static final Target INPUT_STATE_ADDRESS = Target.the("INPUT_STATE_ADDRESS").locatedBy("//*[@id=\"state\"]");
    public static final Target INPUT_CITY_ADDRESS = Target.the("INPUT_CITY_ADDRESS").locatedBy("//*[@id=\"city\"]");
    public static final Target INPUT_ZIPCODE_ADDRESS = Target.the("INPUT_ZIPCODE_ADDRESS").locatedBy("//*[@id=\"zipcode\"]");
    public static final Target INPUT_NUMBER_ADDRESS = Target.the("INPUT_NUMBER_ADDRESS").locatedBy("//*[@id=\"mobile_number\"]");
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("CREATE_ACCOUNT_BUTTON").locatedBy("//*[@id=\"form\"]/div/div/div/div/form/button");

    public static final Target ACCOUNT_CREATED = Target.the("ACCOUNT_CREATED").locatedBy("//*[@id=\"form\"]/div/div/div/h2/b");
    public static final Target CONTINUE_BUTTON = Target.the("CONTINUE_BUTTON").locatedBy("//*[@id=\"form\"]/div/div/div/div/a");
    public static final Target LOGGED_IN = Target.the("LOGGED_IN").locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    public static final Target DELETE_ACCOUNT_BUTTON = Target.the("DELETE_ACCOUNT_BUTTON").locatedBy("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    public static final Target ACCOUNT_DELETED = Target.the("ACCOUNT_DELETED").locatedBy("//*[@id=\"form\"]/div/div/div/h2/b");

    public static final Target EMAIL_EXIST = Target.the("EMAIL_EXIST").locatedBy("//*[@id=\"form\"]/div/div/div[3]/div/form/p");

}