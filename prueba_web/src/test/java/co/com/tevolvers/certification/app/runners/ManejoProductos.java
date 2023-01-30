package co.com.tevolvers.certification.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\manejo_productos.feature",
        glue="co.com.tevolvers.certification.app.stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class ManejoProductos {
}
