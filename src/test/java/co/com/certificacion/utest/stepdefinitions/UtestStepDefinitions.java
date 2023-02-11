package co.com.certificacion.utest.stepdefinitions;

import co.com.certificacion.utest.model.UtestData;
import co.com.certificacion.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user is on the page$")
    public void thatTheUserIsOnThePage() {
        OnStage.theActorCalled("Adrian").wasAbleTo(OpenUp.UtestPage());
    }

    @When("^the user enter their information$")
    public void theUserEnterTheirInformation(List<UtestData>data) {
       // OnStage.theActorInTheSpotlight().attemptsTo(EnterInformation.PersonalInformation(data), DeviceEnterInformation.DeviceInformation(data));

    }

    @Then("^the user will see his profile$")
    public void theUserWillSeeHisProfile() {

    }

}

