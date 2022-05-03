package pa.com.banistmo.certificacion.pruebaTecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CamposDeSeleccion extends PageObject {

    public static final Target ELIGIENDO_SUBMENU_EMPRESA = Target.the("Elegimos el Sub menu de Empresa")
            .located(By.id("header-empresas"));
    public static final Target ELEGIENDO_CAPITAL_INTELIGENTE = Target.the("Elegimos la opcion Capital inteligente")
            .located(By.xpath("//a[@href='https://www.bancolombia.com/wps/portal/empresas/capital-inteligente/?_ga=2.127177102.20346997.1614701551-675894819.1614701551'][contains(.,'Capital Inteligente')]"));
    public static final Target ELIGIENDO_ACTULIADAD_ECONOMICA = Target.the("Elegimos el sub menu actualidad economica")
            .locatedBy("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a");
    public static final Target BAJANDO_HASTA_VER_PUBLICACIONES = Target.the("Presionamos el boton de Ver mas")
            .locatedBy("//button[starts-with(@id,'verMas') and contains(text(), 'Ver más publicaciones') ]");
    public static final Target PRESIONANDO_VER_PUBLICACIONES = Target.the("Bajamos hasta el boton de Ver mas")
            .locatedBy("//button[starts-with(@id,'verMas') and contains(text(), 'Ver más publicaciones') ]");
    public static final Target PRESIONANDO_VER_PUBLICACIONES_SEGUNDAVEZ = Target.the("Presionamos el boton de Ver mas nuevamente")
            .locatedBy("//button[starts-with(@id,'verMas') and contains(text(), 'Ver más publicaciones') ]");
    public static final Target PRESIONANDO_VER_PUBLICACIONES_TERCERAVEZ = Target.the("Presionamos el boton de Ver mas nuevamente")
            .locatedBy("//button[starts-with(@id,'verMas') and contains(text(), 'Ver más publicaciones') ]");
    public static final Target ELEGIMOS_OPEP_AUMENTARA = Target.the("Seleccionamos la opcion de OPEP Aumentara la orferta")
            .locatedBy("(//a[starts-with(@class,'ng-binding') and contains(text(), 'OPEP+ aumentará la oferta de petróleo en julio de 2021') ]");
    public static final Target DESCARGAMOS_PDF = Target.the("Presionamos la imagen para descargar el PDF")
            .locatedBy("//img[@src='/wps/wcm/connect/a7e92f6a-908c-4581-91bd-78e2a5c0f244/informe-petroleo-mayo-2021-dk.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE-a7e92f6a-908c-4581-91bd-78e2a5c0f244-nERG0D7']");

}
