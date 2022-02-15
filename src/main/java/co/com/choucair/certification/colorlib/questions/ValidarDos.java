package co.com.choucair.certification.colorlib.questions;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarDos implements Question {
    public static ValidarDos exitoso() {
        return new ValidarDos();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RepositorioObjetos.POPUP_VALIDATION).viewedBy(actor).asString();
    }
}
