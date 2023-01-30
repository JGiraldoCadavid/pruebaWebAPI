package co.com.tevolvers.certificacion.app.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaPrincipal {
    public static final Target LINK_SIGN_UP = Target.the("Link de registro")
            .located(By.id("signin2"));

    public static final Target FIELD_USERNAME= Target.the("Campo de usuario")
            .located(By.id("sign-username"));

    public static final Target FIELD_PASSWORD= Target.the("Campo de contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTER= Target.the("Boton registro completado")
            .locatedBy("//button[@onclick=\"register()\"]");

    public static final Target LINK_LOG_IN =Target.the("Boton de logueo")
            .located(By.id("login2"));

    public static final Target FIELD_LOGIN_USERNAME = Target.the("Campo usuario login")
            .located(By.id("loginusername"));

    public static final Target FIELD_LOGIN_PASSWORD= Target.the("Campo de contraseña login")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOG_IN= Target.the("Boton usuario logueado")
            .locatedBy("//button[text()='Log in']");

    public static final Target LINK_WELCOME= Target.the("Bienvenida usuario logueado")
            .located(By.id("nameofuser"));

    public static final Target LINK_CART =Target.the("Link carrito de compra")
            .located(By.id("cartur"));

    public static final Target LINK_SELECT_PHONE = Target.the("Link seleccion de celular")
            .locatedBy("//a[contains(text(),'Samsung galaxy s6')]");

    public static final Target LINK_LAPTOPS=Target.the("Link para ver laptops")
            .locatedBy("(//a[@id='itemc'])[2]");

    public static final Target LINK_SELECT_LAPTOP=Target.the("Link seleccion de laptop")
            .locatedBy("(//a[@class='hrefch'])[3]");

    public static final Target LINK_MONITORS=Target.the("Link para ver laptops")
            .locatedBy("//a[contains(text(),'Monitors')]");

    public static final Target LINK_SELECT_MONITOR=Target.the("Link seleccion de laptop")
            .locatedBy("//a[contains(text(),'ASUS Full HD')]");
}
