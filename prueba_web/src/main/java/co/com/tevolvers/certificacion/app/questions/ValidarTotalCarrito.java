package co.com.tevolvers.certificacion.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tevolvers.certificacion.app.userInterface.CarritoCompra.*;

public class ValidarTotalCarrito implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String precio1=FIELD_PRICE_FIRST_PRODUCT.resolveFor(actor).getText();
        String precio2=FIELD_PRICE_SECOND_PRODUCT.resolveFor(actor).getText();
        String precio3=FIELD_PRICE_THIRD_PRODUCT.resolveFor(actor).getText();

        int suma= Integer.parseInt(precio1)+Integer.parseInt(precio2)+Integer.parseInt(precio3);
        boolean resultado=suma==Integer.parseInt(FIELD_TOTAL.resolveFor(actor).getText());

        return resultado;
    }

    public static ValidarTotalCarrito respuesta(){
        return new ValidarTotalCarrito();
    }
}
