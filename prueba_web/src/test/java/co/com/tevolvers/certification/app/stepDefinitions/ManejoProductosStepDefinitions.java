package co.com.tevolvers.certification.app.stepDefinitions;

import co.com.tevolvers.certificacion.app.models.Cliente;
import co.com.tevolvers.certificacion.app.questions.ValidarTextoConfirmacion;
import co.com.tevolvers.certificacion.app.questions.ValidarTotalCarrito;
import co.com.tevolvers.certificacion.app.tasks.IngresarDatosCompra;
import co.com.tevolvers.certificacion.app.tasks.SeleccionarProductos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class ManejoProductosStepDefinitions {

    @Cuando("^el usuario agrega varios productos al carrito$")
    public void elUsuarioAgregaVariosProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductos.seleccionar());
    }

    @Entonces("^el usuario valida que la suma de todos los productos sea igual al total$")
    public void elUsuarioValidaQueLaSumaDeTodosLosProductosSeaIgualAlTotal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTotalCarrito.respuesta(), Matchers.is(true)));
    }

    @Cuando("^el usuario ingresa los datos de la compra$")
    public void elUsuarioIngresaLosDatosDeLaCompra(List<Cliente> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatosCompra.ingresar(datos));
    }

    @Entonces("^el usuario ve el texto (.*)$")
    public void elUsuarioVeElTextoThankYouForYourPurchase(String confirmacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTextoConfirmacion.respuesta(), Matchers.equalTo(confirmacion)));
    }

}
