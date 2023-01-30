package co.com.tevolvers.certificacion.app.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.tevolvers.certificacion.app.utils.Claves.*;

public class CrearToken implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(AUTH).with(request -> request
                        .header(CONTENT_TYPE, ContentType.JSON)
                        .body(
                                "{\n" +
                                        "    \"username\" : \"admin\",\n" +
                                        "    \"password\" : \"password123\"\n" +
                                        "}"
                        ).log().all())
        );

        String token= SerenityRest.lastResponse().jsonPath().getString(TOKEN);
        actor.remember("clave", token);
    }

    public static CrearToken crear(){
        return Tasks.instrumented(CrearToken.class);
    }
}
