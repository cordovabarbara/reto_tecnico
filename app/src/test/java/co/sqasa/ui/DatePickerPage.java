package co.sqasa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatePickerPage {

    // iframe
    public static final Target IFRAME = Target.the("demo iframe")
            .located(By.cssSelector("iframe.demo-frame"));

    // campo de entrada donde se muestra la fecha
    public static final Target DATE_INPUT = Target.the("date input field")
            .located(By.id("datepicker"));

    // selector para hacer click en un día específico
    public static Target DAY(String day) {
        return Target.the("day " + day)
                .located(By.xpath("//a[text()='" + day + "']"));
    }
}
