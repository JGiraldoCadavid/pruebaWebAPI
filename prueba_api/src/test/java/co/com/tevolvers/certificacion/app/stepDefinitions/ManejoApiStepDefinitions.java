package co.com.tevolvers.certificacion.app.stepDefinitions;

import co.com.tevolvers.certificacion.app.models.InformacionRegistro;
import co.com.tevolvers.certificacion.app.questions.ValidarEstado;
import co.com.tevolvers.certificacion.app.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;

public class ManejoApiStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");

    }

    @Dado("^el servicio de restful booker (.*)$")
    public void elServicioDeRestfulBookerHttpsRestfulBookerHerokuappCom(String URL) {
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(URL));
    }

    @Cuando("^el usuario obtiene todos los bookingId$")
    public void ElUsuarioObtieneTodosLosBookingId() {
        OnStage.theActorInTheSpotlight().attemptsTo(ObtenerTodosLosIds.traer());
    }

    @Entonces("^el usuario vera el codigo de respuesta de (.*)$")
    public void ElUsuarioVeraElCodigoDeRespuestaDe(int estado) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEstado.respuesta(estado),Matchers.is(true)));
    }

    @Cuando("^el usuario obtiene el registro con el id (\\d+)$")
    public void ElUsuarioObtieneElRegistroConElId(int id) {
        OnStage.theActorInTheSpotlight().attemptsTo(ObtenerUnId.buscar(id));
    }

    @Cuando("^el usuario crea una entrada exitosa$")
    public void elUsuarioCreaUnaEntradaExitosa(List<InformacionRegistro> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearRegistro.crear(datos));
    }

    @Y("^crea un token para actualizar un booking$")
    public void creaUnTokenParaActualizarUnBooking() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearToken.crear());
    }

    @Cuando("^el usuario actualiza la entrada$")
    public void elUsuarioActualizaLaEntrada(List<InformacionRegistro> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(ActualizarEntrada.actualizar(datos));
    }

}
