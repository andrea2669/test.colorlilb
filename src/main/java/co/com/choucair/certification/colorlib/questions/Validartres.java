package co.com.choucair.certification.colorlib.questions;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Validartres implements Question {

    public static Validartres homedos() {
        return new Validartres();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RepositorioObjetos.HOME).viewedBy(actor).asString();
    }
}
