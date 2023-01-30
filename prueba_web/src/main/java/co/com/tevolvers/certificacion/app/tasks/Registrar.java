package co.com.tevolvers.certificacion.app.tasks;


import co.com.tevolvers.certificacion.app.models.Usuario;
import co.com.tevolvers.certificacion.app.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.tevolvers.certificacion.app.userInterface.PaginaPrincipal.*;

public class Registrar implements Task {

    private String username;
    private String password;

    public Registrar(List<Usuario> data) {
        this.username = data.get(0).getUsername();
        this.password = data.get(0).getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Espera.esperar(3),
                Click.on(LINK_SIGN_UP),
                Enter.theValue(this.username).into(FIELD_USERNAME),
                Enter.theValue(this.password).into(FIELD_PASSWORD),
                Click.on(BTN_REGISTER),
                Espera.esperar(4));
        actor.remember("Usuario",this.username);
        actor.remember("Password",this.password);
    }

    public static Registrar registro(List<Usuario> data){
        return Tasks.instrumented(Registrar.class,data);
    }
}
