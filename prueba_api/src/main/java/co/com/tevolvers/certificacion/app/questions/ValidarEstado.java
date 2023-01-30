package co.com.tevolvers.certificacion.app.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.xpath.operations.String;

public class ValidarEstado implements Question {

    public int estado;

    public ValidarEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return this.estado==SerenityRest.lastResponse().statusCode();
    }

    public static ValidarEstado respuesta(int estado){
        return new ValidarEstado(estado);
    }
}
