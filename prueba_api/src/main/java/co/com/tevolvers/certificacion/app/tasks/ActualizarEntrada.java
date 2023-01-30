package co.com.tevolvers.certificacion.app.tasks;

import co.com.tevolvers.certificacion.app.models.InformacionRegistro;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static co.com.tevolvers.certificacion.app.utils.Claves.*;
import static co.com.tevolvers.certificacion.app.utils.Claves.ADDITIONAL_NEEDS;

public class ActualizarEntrada implements Task {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private Date checkin;
    private Date checkout;
    private String additionalneeds;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ActualizarEntrada(List<InformacionRegistro> datos){
        this.firstname = datos.get(0).getFirstname();
        this.lastname = datos.get(0).getLastname();
        this.totalprice = Integer.parseInt(datos.get(0).getTotalprice());
        this.depositpaid = Boolean.parseBoolean(datos.get(0).getDepositpaid());
        this.checkin = java.sql.Date.valueOf(LocalDate.parse(datos.get(0).getCheckin(),formato));
        this.checkout = java.sql.Date.valueOf(LocalDate.parse(datos.get(0).getCheckout(),formato));
        this.additionalneeds = datos.get(0).getAdditionalneeds();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String clave=actor.recall("clave");
        int bookingId=actor.recall("id");

        actor.attemptsTo(
                Put.to(URL_BOOKING+bookingId).with(request -> request
                        .header(CONTENT_TYPE, ContentType.JSON)
                        .header(COOKIE,TOKEN+"="+clave)
                        .body("{\n" +
                                "    \""+FIRST_NAME+"\" : \""+this.firstname+"\",\n" +
                                "    \""+LAST_NAME+"\" : \""+this.lastname+"\",\n" +
                                "    \""+TOTAL_PRICE+"\" : "+this.totalprice+",\n" +
                                "    \""+ DEPOSIT_PAID +"\" : "+this.depositpaid+",\n" +
                                "    \""+BOOKING_DATES+"\" : {\n" +
                                "        \""+CHECK_IN+"\" : \""+this.checkin+"\",\n" +
                                "        \""+CHECK_OUT+"\" : \""+this.checkout+"\"\n" +
                                "    },\n" +
                                "    \""+ADDITIONAL_NEEDS+"\" : \""+this.additionalneeds+"\"\n" +
                                "}")
                        .log().all()
                )
        );

    }

    public static ActualizarEntrada actualizar(List<InformacionRegistro> datos){
        return Tasks.instrumented(ActualizarEntrada.class,datos);
    }
}
