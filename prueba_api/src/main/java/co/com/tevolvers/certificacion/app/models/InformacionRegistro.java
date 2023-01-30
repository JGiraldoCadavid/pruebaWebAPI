package co.com.tevolvers.certificacion.app.models;

import java.util.Date;

public class InformacionRegistro {

    private String firstname;
    private String lastname;
    private String totalprice;
    private String depositpaid;
    private String checkin;
    private String checkout;
    private String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public String getDepositpaid() {
        return depositpaid;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    @Override
    public String toString() {
        return "InformacionRegistro{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice='" + totalprice + '\'' +
                ", depositpaid='" + depositpaid + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}';
    }
}
