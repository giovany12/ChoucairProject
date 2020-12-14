package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CC = Target.the("Selecciona cursos y certificaciones")
            .locatedBy("//div[@id='certificaciones']//strong");
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da Click para buscar el curso")
            .locatedBy("//*[@id=\"coursesearch\"]/fieldset/button");
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .locatedBy("//a[1][contains(text(),'ISTQB Agile Tester Extension')]");
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .locatedBy("//h1[contains(text(),'ISTQB Agile Tester Extension')]");
}
