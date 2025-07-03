package co.edu.udea.calidadv.FleetGuard360.tasks;

import co.edu.udea.calidadv.FleetGuard360.interactions.AccionesDeFormulario;
import co.edu.udea.calidadv.FleetGuard360.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class LlenarFormularioRegistro implements Task {

    private DatosUsuario datosUsuario = new DatosUsuario();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AccionesDeFormulario.delRegistro(datosUsuario)
        );
    }

    public static LlenarFormularioRegistro conDatos(DatosUsuario datosUsuario) {
        return Tasks.instrumented(LlenarFormularioRegistro.class);
    }
}
