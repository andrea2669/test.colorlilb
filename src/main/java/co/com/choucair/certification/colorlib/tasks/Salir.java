package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;

public class Salir implements Task {


    public static Salir noExitoso() {
        return Tasks.instrumented(Salir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RepositorioObjetos.MENU_FORM),
                Click.on(RepositorioObjetos.FORMVALIDATION),
                Click.on(RepositorioObjetos.CERRAR_POPUP),
                Click.on(RepositorioObjetos.CAMPODOS_VALIDAR));

    }
}
