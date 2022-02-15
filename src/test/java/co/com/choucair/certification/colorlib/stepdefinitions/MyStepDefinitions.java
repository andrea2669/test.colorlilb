package co.com.choucair.certification.colorlib.stepdefinitions;

import co.com.choucair.certification.colorlib.questions.Validar;
import co.com.choucair.certification.colorlib.questions.ValidarDos;
import co.com.choucair.certification.colorlib.questions.Validartres;
import co.com.choucair.certification.colorlib.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepDefinitions {
    @Before
    public void iniciarEscenario()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Camila abre el navegador ingresa a la url de prueba$")
    public void queCamilaAbreElNavegadorIngresaALaUrlDePrueba() {
        OnStage.theActorCalled("camila").wasAbleTo(Abrir.pagina());
    }

    @And("^ingresa usuario$")
    public void ingresaUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.usuario());
    }

    @And("^ingresa clave$")
    public void ingresaClave() {
        OnStage.theActorInTheSpotlight().attemptsTo(Digitar.clave());
    }

    @And("^clic en boton sing in$")
    public void clicEnBotonSingIn() {
        OnStage .theActorInTheSpotlight().attemptsTo(Presionar.singIn());
    }

    @When("^ingresa al aplicativo$")
    public void ingresaAlAplicativo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.home(), Matchers.equalTo("Bootstrap-Admin-Template")));
    }

    @And("^busca el formulario block validation$")
    public void buscaElFormularioBlockValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.blockValidation());
    }

    @And("^diligencia el formulario$")
    public void diligenciarlFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.campoRequired());

    }

    @Then("^verifica que lo diligencio exitosamente$")
    public void verificaQueLoDiligencioExitosamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDos.exitoso(), Matchers.equalTo("Popup Validation")));
    }

    @Given("^que Camila ingresa al navegador e ingresa a la url de prueba$")
    public void queCamilaIngresaAlNavegadorEIngresaALaUrlDePrueba() {
        OnStage.theActorCalled("andrea").wasAbleTo(Acceder.paginaColorLib());
           }

    @And("^ingresa su usuario$")
    public void ingresaSuUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresardos.usuario());
    }

    @And("^ingresa su clave$")
    public void ingresaSuClave() {
        OnStage.theActorInTheSpotlight().attemptsTo(Digitardos.clave());
    }

    @And("^da clic en el boton sing in$")
    public void daClicEnElBotonSingIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionardos.singIn());
    }

    @When("^ingresa al aplicativo de prueba$")
    public void ingresaAlAplicativoDePrueba() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validartres.homedos(), Matchers.equalTo("Bootstrap-Admin-Template")));
    }

    @And("^no diligencia todos los campos$")
    public void noDiligenciaTodosLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Salir.noExitoso());
    }

    @Then("^verifica que no se pudo validar el formulario$")
    public void verificaQueNoSePudoValidarElFormulario() {

    }
}
