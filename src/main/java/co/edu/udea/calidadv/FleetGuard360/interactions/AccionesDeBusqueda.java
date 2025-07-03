package co.edu.udea.calidadv.FleetGuard360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.BuscarProductoInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AccionesDeBusqueda implements Interaction {

    private final String nombreProducto;

    public AccionesDeBusqueda(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.should(seeThat(WebElementQuestion.the(ALL_PRODUCTS), isVisible()));
        actor.attemptsTo(
                Enter.theValue(nombreProducto).into(INPUT),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static AccionesDeBusqueda delProducto(String nombreProducto) {
        return Tasks.instrumented(AccionesDeBusqueda.class, nombreProducto);
}

}
