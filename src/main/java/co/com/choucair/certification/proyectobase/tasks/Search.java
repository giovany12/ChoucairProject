package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.*;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CC),
                Enter.theValue(course).into(INPUT_COURSE),
                Click.on(BUTTON_GO),
                Click.on(SELECT_COURSE)
        );
    }
}
