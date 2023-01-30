package co.com.tevolvers.certification.app.stepDefinitions;

import co.com.tevolvers.certificacion.app.models.Usuario;
import co.com.tevolvers.certificacion.app.questions.VerificarRegistro;
import co.com.tevolvers.certificacion.app.tasks.Loguear;
import co.com.tevolvers.certificacion.app.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class RegistroUsuarioStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Dado("^el usuario ingresa a la pagina web$")
    public void elUsuarioIngresaALaPaginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));
    }

    @Cuando("^el usuario ingresa informacion para el registro$")
    public void elUsuarioIngresaInformacionParaElRegistro(List<Usuario> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.registro(data));
    }

    @Cuando("^el usuario ingresa esta informacion para el logueo$")
    public void elUsuarioIngresaEstaInformacionParaElLogueo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Loguear.login());
    }

    @Entonces("^el usuario ve el mensaje de bienvenida (.*)$")
    public void elUsuarioVeUnaAlertaConElTexto(String confirm) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarRegistro.respuesta(), Matchers.equalTo(confirm)));
    }

}
