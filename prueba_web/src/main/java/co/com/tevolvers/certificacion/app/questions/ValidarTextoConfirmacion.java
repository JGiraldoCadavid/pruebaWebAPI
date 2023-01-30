package co.com.tevolvers.certificacion.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tevolvers.certificacion.app.userInterface.CarritoCompra.TXT_PURCHASE_CONFIRMATION;

public class ValidarTextoConfirmacion implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_PURCHASE_CONFIRMATION).viewedBy(actor).asString();
    }

    public static ValidarTextoConfirmacion respuesta(){
        return new ValidarTextoConfirmacion();
    }
}
