package co.edu.udea.calidadv.FleetGuard360.tasks;
import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeVerificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class VerificarInicioSesion implements Task{
    public static VerificarInicioSesion postRegistro() {
        return instrumented(VerificarInicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AccionesDeVerificar.elInicioDeSesion()
        );
    }
}
