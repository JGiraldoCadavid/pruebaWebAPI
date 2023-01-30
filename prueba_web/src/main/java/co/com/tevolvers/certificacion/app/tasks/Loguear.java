package co.com.tevolvers.certificacion.app.tasks;

import co.com.tevolvers.certificacion.app.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tevolvers.certificacion.app.userInterface.PaginaPrincipal.*;

public class Loguear implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String user=actor.recall("Usuario");
        String password=actor.recall("Password");

        actor.attemptsTo(
                Click.on(LINK_LOG_IN),
                Enter.theValue(user).into(FIELD_LOGIN_USERNAME),
                Enter.theValue(password).into(FIELD_LOGIN_PASSWORD),
                Click.on(BTN_LOG_IN),
                Espera.esperar(5)
        );
    }

    public static Loguear login(){
        return Tasks.instrumented(Loguear.class);
    }
}
