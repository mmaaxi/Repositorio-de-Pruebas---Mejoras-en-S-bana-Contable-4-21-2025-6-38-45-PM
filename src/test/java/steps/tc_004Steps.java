package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

import static org.junit.Assert.assertTrue;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page page = new tc_004Page(driver);

    @Given("La exportación es ejecutada desde el módulo correspondiente")
    public void laExportacionEsEjecutadaDesdeElModuloCorrespondiente() {
        page.executeExport();
    }

    @When("Yo verifico la existencia de la columna 'Monto acumulado Folio Reserva 5401'")
    public void yoVerificoLaExistenciaDeLaColumnaMontoAcumuladoFolioReserva() {
        assertTrue(page.isColumnPresent());
    }

    @Then("La columna debe aparecer y su valor debe ser la suma de la reserva acumulada inmediata anterior y el monto de reserva actual")
    public void laColumnaDebeAparecerYSuValorDebeSerCorrecto() {
        assertTrue(page.isColumnValueCorrect());
    }
}