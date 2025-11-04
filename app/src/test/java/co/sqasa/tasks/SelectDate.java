package co.sqasa.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import co.sqasa.ui.DatePickerPage;

public class SelectDate implements Task {

    private final String day; // solo día del mes, por ejemplo "15"

    private SelectDate(String day) {
        this.day = day;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Cambiar al iframe
        BrowseTheWeb.as(actor).getDriver()
                .switchTo().frame(DatePickerPage.IFRAME.resolveFor(actor).getWrappedElement());

        // Abrir el calendario
        actor.attemptsTo(
                WaitUntil.the(DatePickerPage.DATE_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DatePickerPage.DATE_INPUT)
        );

        // click en el día específico
        actor.attemptsTo(
                Click.on(DatePickerPage.DAY(day))
        );

        // Volver al contenido principal
        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
    }

    public static SelectDate withDay(String day) {
        return new SelectDate(day);
    }
}
