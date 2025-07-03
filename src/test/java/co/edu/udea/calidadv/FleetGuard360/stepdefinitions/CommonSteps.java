package co.edu.udea.calidadv.FleetGuard360.stepdefinitions;

import co.edu.udea.calidadv.FleetGuard360.userinterfaces.BuscarProductoInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.RegistroInterface.SLIDER_HOME_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CommonSteps {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que estoy en la pagina de inicio de Automation Exercise")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeAutomationExercise() {
        OnStage.theActorCalled("Usuario").wasAbleTo(
                Open.browserOn().the(BuscarProductoInterface.class)
        );
        OnStage.theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(SLIDER_HOME_PAGE), isVisible())
        );
    }



}
