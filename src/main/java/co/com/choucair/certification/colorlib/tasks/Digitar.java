package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Digitar implements Task {


    public static Digitar clave() {
        return Tasks.instrumented(Digitar.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("demo").into(RepositorioObjetos.CAMPO_CLAVE)
        );
    }
}
