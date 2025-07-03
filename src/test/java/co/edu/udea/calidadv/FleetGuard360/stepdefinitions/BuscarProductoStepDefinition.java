package co.edu.udea.calidadv.FleetGuard360.stepdefinitions;
import co.edu.udea.calidadv.FleetGuard360.tasks.BuscarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.edu.udea.calidadv.FleetGuard360.userinterfaces.BuscarProductoInterface.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoStepDefinition {

    private Actor usuario;

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("usuario");
    }

    @When("navego a la sección de productos")
    public void navegoASeccionDeProductos() {
        usuario.attemptsTo(Click.on(PRODUCTS_BUTTON));
    }

    @And("busco el término {string} en el campo de búsqueda de productos")
    public void buscoElProducto(String producto) {
        usuario.attemptsTo(BuscarProducto.conElNombre(producto));
    }

    @Then("los productos relacionados son visibles")
    public void losProductosRelacionadosSonVisibles() {
        usuario.should(
                seeThat(WebElementQuestion.the(SEARCHED_PRODUCTS), isVisible())
        );
    }
}
