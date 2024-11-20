package co.com.udea.pagosb.modulopagosb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UserPage {
    public static final Target FLIGHT_FARE_DROPDOWN = Target.the("Flight fare dropdown")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[1]/div");

    public static final Target FLIGHT_FARE_VALUE = Target.the("Flight fare value")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[1]/ul/li/p[2]");

    public static final Target TAXES_DROPDOWN = Target.the("Taxes dropdown")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[3]/div");

    public static final Target TAXES_VALUE = Target.the("Taxes value")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[3]/ul/li/p[2]");

    public static final Target ADDITIONAL_CHARGES_DROPDOWN = Target.the("Additional charges dropdown")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[2]/div");

    public static final Target ADDITIONAL_CHARGES_VALUE = Target.the("Additional charges value")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[3]/div/div[2]/ul/li/p[2]");

    public static final Target PURCHASE_SUMMARY_PAGE_TITLE = Target.the("Detalles de tu vuelo")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[1]/div/div[1]/div[1]/div/h2");

    public static final Target BTN_PAYMENT_WITH_CARD = Target.the("Payment method")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[2]/div/div[2]/form/label");

    public static final Target BTN_CONTINUE = Target.the("Continue button")
            .locatedBy("//*[@id=\"__next\"]/main/div/div[2]/div/div[3]/a/button");

    public static final Target BTN_CONFIRM_PURCHASE = Target.the("Confirm purchase button")
            .locatedBy("//*[@id=\"__next\"]/main/main/div[3]/button");

    public static final Target PURCHASE_SUCCESSFUL_MESSAGE = Target.the("Purchase successful message")
            .locatedBy("//*[@id=\"successfull-buy-title\"]");
}
