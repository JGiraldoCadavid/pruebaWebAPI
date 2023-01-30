package co.com.tevolvers.certificacion.app.tasks;

import co.com.tevolvers.certificacion.app.models.Cliente;
import co.com.tevolvers.certificacion.app.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.tevolvers.certificacion.app.userInterface.CarritoCompra.*;

public class IngresarDatosCompra implements Task {

    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;


    public IngresarDatosCompra(List<Cliente> datos) {
        this.name = datos.get(0).getName();
        this.country = datos.get(0).getCountry();
        this.city = datos.get(0).getCity();
        this.creditCard = datos.get(0).getCreditCard();
        this.month = datos.get(0).getMonth();
        this.year = datos.get(0).getYear();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PLACE_ORDER),
                Enter.theValue(this.name).into(FIELD_NAME),
                Enter.theValue(this.country).into(FIELD_COUNTRY),
                Enter.theValue(this.city).into(FIELD_CITY),
                Enter.theValue(this.creditCard).into(FIELD_CREDIT_CARD),
                Enter.theValue(this.month).into(FIELD_MONTH),
                Enter.theValue(this.year).into(FIELD_YEAR),
                Click.on(BTN_PURCHASE),
                Espera.esperar(2)
        );
    }

    public static IngresarDatosCompra ingresar(List<Cliente> datos){
        return Tasks.instrumented(IngresarDatosCompra.class,datos);
    }
}
