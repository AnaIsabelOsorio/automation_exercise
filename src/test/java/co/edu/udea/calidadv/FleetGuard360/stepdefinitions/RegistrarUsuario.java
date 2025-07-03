package co.edu.udea.calidadv.FleetGuard360.stepdefinitions;

import co.edu.udea.calidadv.FleetGuard360.models.DatosUsuario;
import co.edu.udea.calidadv.FleetGuard360.questions.ContieneElTexto;
import co.edu.udea.calidadv.FleetGuard360.tasks.IniciarRegistro;
import co.edu.udea.calidadv.FleetGuard360.tasks.LlenarFormularioRegistro;
import co.edu.udea.calidadv.FleetGuard360.tasks.VerificarInicioSesion;
import co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RegistrarUsuario {

    private RegistroInterface registroInterface;
    DatosUsuario datos = new DatosUsuario();
    private Actor usuario;

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("usuario");
    }

    @When("registro un nuevo usuario con el nombre {string} y el email {string}")
    public void elUsuarioIntroduceUnNombreYUnEmailParaRegistrarse(String nombre, String email) {
        usuario.attemptsTo(
                IniciarRegistro.conLosDatos(nombre, email)
        );
    }

    @And("completo el formulario de registro con todos los datos requeridos")
    public void elUsuarioCompletaElFormularioDeRegistroConTodosLosDatosYCreaLaCuenta() {
        usuario.attemptsTo(
                LlenarFormularioRegistro.conDatos(datos)
        );
    }

    @Then("mi cuenta se crea correctamente")
    public void elUsuarioVerificaElRegistroExitosoYLoginAutomatico() {
        usuario.attemptsTo(
                VerificarInicioSesion.postRegistro()
        );
    }


    @When("elimino la cuenta recién creada")
    public void elUsuarioHaceClicParaBorrarLaCuenta() {
        usuario.attemptsTo(Click.on(DELETE_ACCOUNT_BUTTON));
    }

    @Then("veo el mensaje ACCOUNT DELETED!")
    public void seVerificaQueApareceElMensajeAccountDeleted() {
        usuario.should(
                seeThat(ContieneElTexto.elElemento(ACCOUNT_DELETED, "ACCOUNT DELETED!"), equalTo(true))
        );

    }

    @And("hago clic en el botón Continue para finalizar")
    public void elUsuarioHaceClicEnElBotonContinueParaFinalizar() {
        usuario.attemptsTo(Click.on(CONTINUE_BUTTON));
    }
}
