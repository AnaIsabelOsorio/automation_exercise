package co.edu.udea.calidadv.FleetGuard360.tasks;

import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeFormulario;
import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeIniciarFormulario;
import co.edu.udea.calidadv.FleetGuard360.questions.ContieneElTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class IniciarRegistro implements Task {
    private final String nombre;
    private final String email;

    public IniciarRegistro(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AccionesDeIniciarFormulario.deRegistro(nombre, email)
        );
    }

    public static IniciarRegistro conLosDatos(String nombre, String email) {
        return Tasks.instrumented(IniciarRegistro.class, nombre, email);
    }
}
