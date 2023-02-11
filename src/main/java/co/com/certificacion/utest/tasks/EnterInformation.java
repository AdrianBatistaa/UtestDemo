package co.com.certificacion.utest.tasks;

import co.com.certificacion.utest.model.UtestData;
import co.com.certificacion.utest.userinterface.PersonalInformation;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

import static co.com.certificacion.utest.userinterface.PersonalInformation.*;


public class EnterInformation implements Task {
    private String firstname;
    private String lastname;
    private String email;
    private String month;
    private String day;
    private String year;




    public EnterInformation(List<UtestData>data) {
        this.firstname = data.get(0).getFirstname();
        this.lastname = data.get(0).getLastname();
        this.email = data.get(0).getEmail();
        this.month = data.get(0).getMonth();
        this.day = data.get(0).getDay();
        this.year = data.get(0).getYear();



    }


    public static EnterInformation PersonalInformation(List<UtestData>data){
        return Tasks.instrumented(EnterInformation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonalInformation.REGISTER_BUTTON),
                Enter.theValue(firstname).into(PersonalInformation.INPUT_FIRSTNAME),
                Enter.theValue(lastname).into(PersonalInformation.INPUT_LASTNAME),
                Enter.theValue(email).into(PersonalInformation.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(MONTH),
                SelectFromOptions.byVisibleText(day).from(DAY),
                SelectFromOptions.byVisibleText(year).from(YEAR),

                Click.on(PersonalInformation.NEXT_BUTTONLOCATION),
                Click.on(PersonalInformation.NEXT_BUTTONDEVICES));











    }
}
