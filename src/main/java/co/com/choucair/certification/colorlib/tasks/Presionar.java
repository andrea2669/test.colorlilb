package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Presionar implements Task {

    public static Presionar singIn() {
        return Tasks.instrumented(Presionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RepositorioObjetos.SINGIN));

    }
}
