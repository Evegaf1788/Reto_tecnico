package pa.com.banistmo.certificacion.pruebaTecnica.runners;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/informe_sector_petroleo2021.feature",
        tags = "@informe",
        glue = "pa.com.banistmo.certificacion.pruebaTecnica.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ejecucion_pruebas {
}
