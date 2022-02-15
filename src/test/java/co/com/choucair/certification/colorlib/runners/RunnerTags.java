package co.com.choucair.certification.colorlib.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/colorlib_reto1.feature",
        tags = "@regresion",
        glue = "co.com.choucair.certification.colorlib.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {

}
