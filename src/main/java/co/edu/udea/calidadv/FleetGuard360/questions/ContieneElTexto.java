package co.edu.udea.calidadv.FleetGuard360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ContieneElTexto implements Question<Boolean> {

    private final Target elElemento;
    private final String textoEsperado;

    public ContieneElTexto(Target elElemento, String textoEsperado) {
        this.elElemento = elElemento;
        this.textoEsperado = textoEsperado;
    }

    public static ContieneElTexto elElemento(Target elElemento, String textoEsperado) {
        return new ContieneElTexto(elElemento, textoEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoActual = Text.of(elElemento).answeredBy(actor);
        return textoActual.contains(textoEsperado);
    }
}
