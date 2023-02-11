package co.com.certificacion.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DeviceInformation {

    public static final Target BTN_COMPUTER = Target.the( "dropdown that shows us the mobile field")

            .located(By.xpath("//span[contains(text(),'Linux')]"));

    public static final Target MOBILE = Target.the( "dropdown that shows us the mobile field")

            .located(By.xpath("//span[contains(text(),'Select Brand')]//span[contains(text(),'Select Brand')]"));

    public static final Target MODEL = Target.the( "dropdown that shows us the model field")

            .located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target OS = Target.the( "dropdown that shows us the os field")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target NEXT_LASTBUTTON = Target.the("button that shows us the form to register")

            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));


}
