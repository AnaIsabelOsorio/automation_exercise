package co.edu.udea.calidadv.FleetGuard360.interactions;

import co.edu.udea.calidadv.FleetGuard360.questions.ContieneElTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AccionesDeVerificar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        seeThat(ContieneElTexto.elElemento(ACCOUNT_CREATED, "ACCOUNT CREATED!"), equalTo(true));
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
        seeThat(ContieneElTexto.elElemento(LOGGED_IN, "Logged in as"), equalTo(true));
    }

    public static AccionesDeVerificar elInicioDeSesion() {
        return Tasks.instrumented(AccionesDeVerificar.class);
}

}
