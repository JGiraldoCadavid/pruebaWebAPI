package co.com.tevolvers.certificacion.app.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProducto {

    public static final Target BTN_ADD_TO_CART= Target.the("Agregar al carrito")
            .locatedBy("//a[contains(text(),'Add to cart')]");

    public static final Target LINK_BACK_TO_HOME=Target.the("Volver a la pagina principal")
            .locatedBy("(//a[@class='nav-link'])[1]");
}
