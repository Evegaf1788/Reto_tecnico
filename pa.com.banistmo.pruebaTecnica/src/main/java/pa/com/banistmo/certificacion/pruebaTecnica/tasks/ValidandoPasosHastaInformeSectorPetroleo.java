package pa.com.banistmo.certificacion.pruebaTecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static pa.com.banistmo.certificacion.pruebaTecnica.userinterface.CamposDeSeleccion.*;


public class ValidandoPasosHastaInformeSectorPetroleo implements Task {

    public static Performable seleccionamosOpciones() { return Tasks.instrumented(ValidandoPasosHastaInformeSectorPetroleo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELIGIENDO_SUBMENU_EMPRESA),
                Click.on(ELEGIENDO_CAPITAL_INTELIGENTE),
                Switch.toTheOtherWindow(),
                Click.on(ELIGIENDO_ACTULIADAD_ECONOMICA),
                Scroll.to(BAJANDO_HASTA_VER_PUBLICACIONES),
                JavaScriptClick.on(PRESIONANDO_VER_PUBLICACIONES),
                JavaScriptClick.on(PRESIONANDO_VER_PUBLICACIONES_SEGUNDAVEZ),
                Scroll.to(BAJANDO_HASTA_VER_PUBLICACIONES),
                JavaScriptClick.on(PRESIONANDO_VER_PUBLICACIONES_TERCERAVEZ),
                JavaScriptClick.on(ELEGIMOS_OPEP_AUMENTARA),
                Click.on(DESCARGAMOS_PDF)


        );
    }
}
