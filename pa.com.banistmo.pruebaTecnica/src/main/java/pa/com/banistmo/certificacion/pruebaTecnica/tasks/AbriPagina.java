package pa.com.banistmo.certificacion.pruebaTecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.banistmo.certificacion.pruebaTecnica.userinterface.AbriendoPagina;

public class AbriPagina implements Task {

    private AbriendoPagina abriendoPagina;

    public static AbriPagina abriendoPaginaBancolmbia() { return Tasks.instrumented(AbriPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abriendoPagina));
    }
}
