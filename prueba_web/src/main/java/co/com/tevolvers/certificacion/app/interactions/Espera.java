package co.com.tevolvers.certificacion.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Espera implements Interaction {

    private  int tiempoEspera;

    public Espera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(this.tiempoEspera*1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static Espera esperar(int tiempoEspera){
        return Tasks.instrumented(Espera.class,tiempoEspera);
    }
}
