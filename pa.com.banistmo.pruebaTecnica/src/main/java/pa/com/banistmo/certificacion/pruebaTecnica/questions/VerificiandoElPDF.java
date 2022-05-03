package pa.com.banistmo.certificacion.pruebaTecnica.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificiandoElPDF  implements Question<Boolean> {
    private String tituloDocumento;

    public VerificiandoElPDF(String tituloDocumento){ this.tituloDocumento = tituloDocumento;}

    public static VerificiandoElPDF enLaPestana(String tituloDocumento) { return new VerificiandoElPDF(tituloDocumento);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String ventana = Serenity.getWebdriverManager().getWebdriver().getCurrentUrl();

        if (ventana.contains(tituloDocumento)){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
