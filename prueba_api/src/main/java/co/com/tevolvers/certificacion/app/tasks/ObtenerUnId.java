package co.com.tevolvers.certificacion.app.tasks;

import co.com.tevolvers.certificacion.app.models.InformacionRegistro;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import javax.sound.sampled.Line;

import static co.com.tevolvers.certificacion.app.utils.Claves.*;

public class ObtenerUnId implements Task {

    private int id;

    public ObtenerUnId(int id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Get.resource(URL_BOOKING+this.id).with( request -> request.log().all())
            );

            actor.remember("body", SerenityRest.lastResponse().getBody().as(InformacionRegistro.class));

    }

    public static ObtenerUnId buscar(int id){
        return Tasks.instrumented(ObtenerUnId.class,id);
    }
}
