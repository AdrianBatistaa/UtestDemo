package co.com.certificacion.utest.tasks;

import co.com.certificacion.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task {
    private UtestPage UtestPage;

    public static OpenUp UtestPage(){
        return Tasks.instrumented(OpenUp.class);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
   //     actor.attemptsTo(Open.browserOn(UtestPage));

    }
}
