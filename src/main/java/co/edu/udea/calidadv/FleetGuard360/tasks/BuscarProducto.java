package co.edu.udea.calidadv.FleetGuard360.tasks;

import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeBusqueda;
import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeIniciarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.BuscarProductoInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProducto implements Task {
    private final String nombreProducto;

    public BuscarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static Performable conElNombre(String nombreProducto) {
        return instrumented(BuscarProducto.class, nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AccionesDeBusqueda.delProducto(nombreProducto));
    }
}