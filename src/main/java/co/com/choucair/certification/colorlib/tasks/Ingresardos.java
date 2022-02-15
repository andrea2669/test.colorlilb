package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresardos implements Task {

    public static Ingresardos usuario() {
        return Tasks.instrumented(Ingresardos.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("demo").into(RepositorioObjetos.CAMPO_USUARIODOS));
    }
}
