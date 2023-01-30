package co.com.tevolvers.certificacion.app.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompra {

    public static final Target FIELD_PRICE_FIRST_PRODUCT= Target.the("Primer campo de precio")
            .locatedBy("//tr[@class='success']//td[3]");

    public static final Target FIELD_TOTAL= Target.the("Precio total")
            .located(By.id("totalp"));

    public static final Target FIELD_PRICE_SECOND_PRODUCT= Target.the("Segundo campo de precio")
            .locatedBy("//tr[2][@class='success']//td[3]");

    public static final Target FIELD_PRICE_THIRD_PRODUCT= Target.the("Tercer campo de precio")
            .locatedBy("//tr[3][@class='success']//td[3]");

    public static final Target FIELD_NAME =Target.the("Nombre del cliente")
            .located(By.id("name"));

    public static final Target FIELD_COUNTRY= Target.the("País de residencia del cliente")
            .located(By.id("country"));

    public static final Target FIELD_CITY=Target.the("Ciudad de residencia del cliente")
            .located(By.id("city"));

    public static final Target FIELD_CREDIT_CARD= Target.the("Número tarjeta de crédito del cliente")
            .located(By.id("card"));

    public static final Target FIELD_MONTH=Target.the("Mes vencimiento tarjeta de crédito del cliente")
            .located(By.id("month"));

    public static final Target FIELD_YEAR=Target.the("Año vencimiento tarjeta de crédito del cliente")
            .located(By.id("year"));

    public static final Target BTN_PURCHASE = Target.the("Botón confirmacion de compra")
            .locatedBy("//button[text()='Purchase']");

    public static final Target TXT_PURCHASE_CONFIRMATION= Target.the("Texto que agradece la compra")
            .locatedBy("//h2[text()='Thank you for your purchase!']");

    public static final Target BTN_PLACE_ORDER=Target.the("Boton realizar pedido")
            .locatedBy("//button[text()='Place Order']");

}
