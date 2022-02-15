package co.com.choucair.certification.colorlib.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RepositorioObjetos {
    public static final Target CAMPO_USUARIO = Target.the("Ingresar usuario: Demo").located(By.cssSelector("#login > form > input.form-control.top"));
    public static final Target CAMPO_CLAVE = Target.the("digitarclave").located(By.cssSelector("input.form-control.bottom"));
    public static final Target SINGIN = Target.the("presionarsingin").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target HOME = Target.the("inicio home").located(By.id("bootstrap-admin-template"));
    public static final Target MENU_FORM = Target.the("buscarform").located(By.cssSelector("#menu > li:nth-child(6) > a > span.link-title"));
    public static final Target FORMVALIDATION = Target.the("click").located(By.cssSelector("#menu > li.active > ul > li:nth-child(2) > a"));
    public static final Target CERRAR_POPUP = Target.the("cerrar").located(By.cssSelector("#content > div > div > div:nth-child(2) > div > div > header > div.toolbar > nav > a.btn.btn-danger.btn-xs.close-box > i"));
    public static final Target CAMPO_REQUIRED = Target.the("Diligenciarrequired: Andrea").located(By.cssSelector("#required2"));
    public static final Target CAMPO_EMAIL = Target.the("Diligenciaremail:andrea2669@gmail.com").located(By.cssSelector("#email2"));
    public static final Target CAMPO_PASSWORD = Target.the("Diligenciarpassword: 12345").located(By.cssSelector("#password2"));
    public static final Target CAMPO_CONFIRMPASSWORD = Target.the("Confirmpassword: 12345").located(By.cssSelector("#confirm_password2"));
    public static final Target CAMPO_DATE = Target.the("Diligenciardate: 13/05/1987").located(By.cssSelector("#date2"));
    public static final Target CAMPO_URL = Target.the("Diligenciarurl: colorlib.com/polygon/metis/form-validation.html").located(By.cssSelector("#url2"));
    public static final Target CAMPO_DIGITSONLY = Target.the("Diligenciardigitsonly: 54321").located(By.cssSelector("#digits"));
    public static final Target CAMPO_RANGE = Target.the("Diligenciarrange: 10").located(By.id("range"));
    public static final Target CAMPO_AGREE = Target.the("clickagree").located(By.id("agree2"));
    public static final Target CAMPO_VALIDATE = Target.the("clickvalidation").located(By.cssSelector("#block-validate > div.form-actions.no-margin-bottom > input")) ;
    public static final Target POPUP_VALIDATION = Target.the("Mostrarmensaje: Popup Validation").located(By.xpath("//h5[contains(text(),'Popup Validation')]"));
    public static final Target CAMPO_USUARIODOS = Target.the("Ingresarusuariodos: demo").located(By.cssSelector("#login > form > input.form-control.top"));
    public static final Target CAMPO_CLAVEDOS = Target.the("Digitarclavedos:demo").located(By.cssSelector("#login > form > input.form-control.bottom"));
    public static final Target SING_IN = Target.the("presionardossingin").located(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
    public static final Target HOMEDOS = Target.the("validartres").located(By.cssSelector("Bootstrap-Admin-Template"));
    public static final Target CAMPODOS_VALIDAR = Target.the("campodosvalidar").located(By.cssSelector("#block-validate > div.form-actions.no-margin-bottom > input"));
}
