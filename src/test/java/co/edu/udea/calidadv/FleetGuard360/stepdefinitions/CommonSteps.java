package co.edu.udea.calidadv.FleetGuard360.stepdefinitions;

import co.edu.udea.calidadv.FleetGuard360.userinterfaces.BuscarProductoInterface;
import co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.SLIDER_HOME_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CommonSteps {

    private Actor usuario;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("usuario");
    }

    @Given("que estoy en la pagina de inicio de Automation Exercise")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeAutomationExercise() {
        usuario.wasAbleTo(
                Open.browserOn().the((RegistroInterface.class))
        );
        usuario.should(
                seeThat(WebElementQuestion.the(SLIDER_HOME_PAGE), isVisible())
        );
    }



}
