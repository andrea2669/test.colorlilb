package co.com.choucair.certification.colorlib.tasks;

import co.com.choucair.certification.colorlib.userinterface.RepositorioObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Diligenciar implements Task {
    public static Diligenciar campoRequired() {
        return Tasks.instrumented(Diligenciar.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("camila").into(RepositorioObjetos.CAMPO_REQUIRED),
                Enter.theValue("andrea2669@gmail.com").into(RepositorioObjetos.CAMPO_EMAIL),
                Enter.theValue("12345").into(RepositorioObjetos.CAMPO_PASSWORD),
                Enter.theValue("12345").into(RepositorioObjetos.CAMPO_CONFIRMPASSWORD),
                Enter.theValue("13/05/1987").into(RepositorioObjetos.CAMPO_DATE),
                Enter.theValue("https://colorlib.com/polygon/metis/form-validation.html").into(RepositorioObjetos.CAMPO_URL),
                Enter.theValue("123456").into(RepositorioObjetos.CAMPO_DIGITSONLY),
                Enter.theValue("10").into(RepositorioObjetos.CAMPO_RANGE),
                Click.on(RepositorioObjetos.CAMPO_AGREE),
                Click.on(RepositorioObjetos.CAMPO_VALIDATE)

        );
    }

    }
