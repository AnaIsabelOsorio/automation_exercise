package co.edu.udea.calidadv.FleetGuard360.interactions;

import co.edu.udea.calidadv.FleetGuard360.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.*;
import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.CREATE_ACCOUNT_BUTTON;

public class AccionesDeFormulario implements Interaction {

    private final DatosUsuario datosUsuario;

    public AccionesDeFormulario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_TITLE_MRS),
                Enter.theValue(datosUsuario.getPassword()).into(INPUT_PASSWORD),
                SelectFromOptions.byVisibleText(datosUsuario.getDayOfBirth()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(datosUsuario.getMonthOfBirth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(datosUsuario.getYearOfBirth()).from(SELECT_YEAR),
                Click.on(CHECKBOX_NEWSLETTER),
                Click.on(CHECKBOX_SPECIALOFFERS),
                Enter.theValue(datosUsuario.getFirstName()).into(INPUT_FIRST_NAME_ADDRESS),
                Enter.theValue(datosUsuario.getLastName()).into(INPUT_LAST_NAME_ADDRESS),
                Enter.theValue(datosUsuario.getCompany()).into(INPUT_COMPANY_ADDRESS),
                Enter.theValue(datosUsuario.getAddress1()).into(INPUT_ADDRESS),
                Enter.theValue(datosUsuario.getAddress2()).into(INPUT_ADDRESS2),
                SelectFromOptions.byVisibleText(datosUsuario.getCountry()).from(SELECT_COUNTRY_ADDRESS),
                Enter.theValue(datosUsuario.getState()).into(INPUT_STATE_ADDRESS),
                Enter.theValue(datosUsuario.getCity()).into(INPUT_CITY_ADDRESS),
                Enter.theValue(datosUsuario.getZipcode()).into(INPUT_ZIPCODE_ADDRESS),
                Enter.theValue(datosUsuario.getMobileNumber()).into(INPUT_NUMBER_ADDRESS),
                Click.on(CREATE_ACCOUNT_BUTTON)
        );
    }

    public static AccionesDeFormulario delRegistro(DatosUsuario datosUsuario) {
        return Tasks.instrumented(AccionesDeFormulario.class, datosUsuario);
}

}
