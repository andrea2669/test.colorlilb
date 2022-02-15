package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Presionardos implements Task {

    public static Presionardos singIn() {
        return Tasks.instrumented(Presionardos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RepositorioObjetos.SING_IN));
    }
}
