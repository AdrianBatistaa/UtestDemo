package co.com.certificacion.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register")

            .located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

    public static final Target INPUT_FIRSTNAME = Target.the( "input that shows us the first name field")

            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the( "input that shows us the first name field")

            .located(By.id("lastName"));


    public static final Target INPUT_EMAIL = Target.the( "input that shows us the last name field")

            .located(By.id("email"));

    public static final Target MONTH = Target.the( "input that shows us the first name field")

            .located(By.id("birthMonth"));

    public static final Target DAY = Target.the( "input that shows us the first name field")

            .located(By.id("birthDay"));

    public static final Target YEAR = Target.the( "input that shows us the first name field")

            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTONLOCATION = Target.the("button that shows us the form to register")

            .located(By.xpath("//span[contains(text(),'Next: Location')]"));



    public static final Target NEXT_BUTTONDEVICES = Target.the("button that shows us the form to register")

            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));















}
