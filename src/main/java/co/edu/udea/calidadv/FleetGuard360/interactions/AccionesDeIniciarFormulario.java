package co.edu.udea.calidadv.FleetGuard360.interactions;

import co.edu.udea.calidadv.FleetGuard360.questions.ContieneElTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AccionesDeIniciarFormulario implements Interaction {
    private final String nombre;
    private final String email;

    public AccionesDeIniciarFormulario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SIGNUP_LOGIN_BUTTON));
        seeThat(ContieneElTexto.elElemento(NEW_USER_SIGNUP, "New User Signup!"), equalTo(true));
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_NAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Click.on(SIGNUP_BUTTON)
        );
        seeThat(ContieneElTexto.elElemento(ENTER_ACCOUNT_INFORMATION, "ENTER ACCOUNT INFORMATION"), equalTo(true));
    }


    public static Performable deRegistro(String nombre, String email) {
        return Tasks.instrumented(AccionesDeIniciarFormulario.class, nombre, email);
    }
}
