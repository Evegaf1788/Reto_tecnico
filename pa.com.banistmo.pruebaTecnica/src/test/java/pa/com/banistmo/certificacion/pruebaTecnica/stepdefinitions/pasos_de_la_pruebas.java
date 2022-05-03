package pa.com.banistmo.certificacion.pruebaTecnica.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.certificacion.pruebaTecnica.questions.VerificiandoElPDF;
import pa.com.banistmo.certificacion.pruebaTecnica.tasks.AbriPagina;
import pa.com.banistmo.certificacion.pruebaTecnica.tasks.ValidandoPasosHastaInformeSectorPetroleo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class pasos_de_la_pruebas {

    @Before
    public void setStage() {setTheStage(new OnlineCast());}

    @Given("abrir la pagina de Bancolombia")
    public void abrirLaPaginaDeBancolombia() {
        theActorCalled("Elmer").wasAbleTo(AbriPagina.abriendoPaginaBancolmbia());
    }
    @When("ingreso al menu de empresa, capital inteligente y posterior poder descargar el informe del sector petroleo mayo2021")
    public void ingresoAlMenuDeEmpresaCapitalInteligenteYPosteriorPoderDescargarElInformeDelSectorPetroleoMayo2021() {
        theActorInTheSpotlight().attemptsTo(ValidandoPasosHastaInformeSectorPetroleo.seleccionamosOpciones());
    }
    @Then("^se verifica que este presente el contrato con nombre (.*)$")
    public void seVerificaQueEstePresenteElContratoConNombreInformeSectorialPetroleoJunio2021Pdf(String tituloDocumento) {
        theActorInTheSpotlight().should(seeThat(VerificiandoElPDF.enLaPestana(tituloDocumento)));
    }
}
