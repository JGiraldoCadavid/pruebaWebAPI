package co.com.tevolvers.certificacion.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.tevolvers.certificacion.app.utils.Claves.*;

public class ObtenerTodosLosIds implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(URL_BOOKING)
        );
    }

    public static ObtenerTodosLosIds traer(){
        return Tasks.instrumented(ObtenerTodosLosIds.class);
    }
}
