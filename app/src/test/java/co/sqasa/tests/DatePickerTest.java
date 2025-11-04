package co.sqasa.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import co.sqasa.tasks.SelectDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class DatePickerTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    private Actor usuario;

    @BeforeEach
    public void setUp() {
        usuario = Actor.named("Usuario")
                .whoCan(BrowseTheWeb.with(driver));
    }

    @Test
    public void deberiaSeleccionarFechaEspecificaEnOtroMes() {
        givenThat(usuario).wasAbleTo(
                Open.url("https://jqueryui.com/datepicker/")
        );

        // Seleccionar fecha específica  otro mes
        usuario.attemptsTo(
                SelectDate.withDay("30")
        );
    }
}
