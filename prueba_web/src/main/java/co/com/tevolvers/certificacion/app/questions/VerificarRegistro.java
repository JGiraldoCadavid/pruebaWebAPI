package co.com.tevolvers.certificacion.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Alert;

import static co.com.tevolvers.certificacion.app.userInterface.PaginaPrincipal.*;

public class VerificarRegistro implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return LINK_WELCOME.resolveFor(actor).getText();
    }

    public static VerificarRegistro respuesta(){
        return new VerificarRegistro();
    }
}
