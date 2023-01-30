package co.com.tevolvers.certificacion.app.tasks;

import co.com.tevolvers.certificacion.app.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tevolvers.certificacion.app.userInterface.PaginaPrincipal.*;
import static co.com.tevolvers.certificacion.app.userInterface.PaginaProducto.*;

public class SeleccionarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Espera.esperar(2),
                Click.on(LINK_SELECT_PHONE),
                Espera.esperar(2),
                Click.on(BTN_ADD_TO_CART),
                Espera.esperar(4),
                Click.on(LINK_BACK_TO_HOME),
                Espera.esperar(2),
                Click.on(LINK_LAPTOPS),
                Espera.esperar(2),
                Click.on(LINK_SELECT_LAPTOP),
                Espera.esperar(2),
                Click.on(BTN_ADD_TO_CART),
                Espera.esperar(4),
                Click.on(LINK_BACK_TO_HOME),
                Espera.esperar(2),
                Click.on(LINK_MONITORS),
                Espera.esperar(2),
                Click.on(LINK_SELECT_MONITOR),
                Espera.esperar(2),
                Click.on(BTN_ADD_TO_CART),
                Espera.esperar(4),
                Click.on(LINK_CART),
                Espera.esperar(2)
        );
    }

    public static SeleccionarProductos seleccionar(){
        return Tasks.instrumented(SeleccionarProductos.class);
    }
}
