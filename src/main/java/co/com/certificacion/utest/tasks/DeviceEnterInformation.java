package co.com.certificacion.utest.tasks;

import co.com.certificacion.utest.model.UtestData;
import co.com.certificacion.utest.userinterface.DeviceInformation;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static co.com.certificacion.utest.userinterface.DeviceInformation.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class DeviceEnterInformation implements Task {
    private String mobile;
    private String model;
    private String operatingsystem;

    public DeviceEnterInformation(List<UtestData>data) {
        this.mobile = data.get(0).getMobile();
        this.model = data.get(0).getModel();
        this.operatingsystem = data.get(0).getOperatingsystem();
    }

    public static DeviceEnterInformation DeviceInformation(List<UtestData>data){
        return Tasks.instrumented(DeviceEnterInformation.class,data);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(WaitUntil.the(BTN_COMPUTER,isEnabled()).forNoMoreThan(60).seconds(),
                 WaitUntil.the(MOBILE,isEnabled()).forNoMoreThan(40).seconds(),
                 SelectFromOptions.byVisibleText(mobile).from(MOBILE),
                 SelectFromOptions.byVisibleText(model).from(MODEL),
                 WaitUntil.the(MODEL,isEnabled()).forNoMoreThan(40).seconds(),
                 SelectFromOptions.byVisibleText(operatingsystem).from(OS),
                 WaitUntil.the(NEXT_LASTBUTTON,isEnabled()).forNoMoreThan(30).seconds(),
                 Click.on(DeviceInformation.NEXT_LASTBUTTON));





    }
}
