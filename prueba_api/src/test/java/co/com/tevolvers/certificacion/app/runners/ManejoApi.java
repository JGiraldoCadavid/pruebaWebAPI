package co.com.tevolvers.certificacion.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\manejo_api.feature",
        glue="co\\com\\tevolvers\\certificacion\\app\\stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class ManejoApi {
}
