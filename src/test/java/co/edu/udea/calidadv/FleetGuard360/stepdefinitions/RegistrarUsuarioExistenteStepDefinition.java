package co.edu.udea.calidadv.FleetGuard360.stepdefinitions;

import co.edu.udea.calidadv.FleetGuard360.questions.ContieneElTexto;
import co.edu.udea.calidadv.FleetGuard360.tasks.IniciarRegistro;
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
import static java.util.function.Predicate.isEqual;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RegistrarUsuarioExistenteStepDefinition {

    private RegistroInterface registroInterface;

    private Actor usuario;

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("usuario");
    }

    @When("intento registrarme con el nombre {string} y el email existente {string}")
    public void elUsuarioIntroduceUnNombreYUnEmailParaRegistrarse(String nombre, String email) {
        usuario.attemptsTo(
                IniciarRegistro.conLosDatos(nombre, email)
        );
    }

    @Then("veo el mensaje de error Email Address already exist!")
    public void elMensajeAccountCreatedDebeSerVisible() {
        usuario.should(
                seeThat(ContieneElTexto.elElemento(EMAIL_EXIST, "Email Address already exist!"), equalTo(true))
        );
    }

}
