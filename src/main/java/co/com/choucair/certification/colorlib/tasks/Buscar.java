package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {

    public static Buscar blockValidation() {

        return Tasks.instrumented(Buscar.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(RepositorioObjetos.MENU_FORM),
            Click.on(RepositorioObjetos.FORMVALIDATION),Click.on(RepositorioObjetos.CERRAR_POPUP));
    }
}
