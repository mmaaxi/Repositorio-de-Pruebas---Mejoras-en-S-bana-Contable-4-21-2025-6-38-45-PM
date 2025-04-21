package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page excelPage;

    @Given("el usuario ha exportado el documento Excel")
    public void exportarDocumentoExcel() {
        excelPage = new tc_002Page(driver);
        excelPage.exportarDocumento();
    }

    @When("verifique que exista la nueva columna 'Estado Código' a la derecha de la columna I")
    public void verificarColumnaEstadoCodigo() {
        assertTrue(excelPage.existeColumnaEstado());
    }

    @Then("el Excel se exporta correctamente y la columna 'Estado Código' aparece en la posición correcta sin datos erróneos")
    public void valiarExportacionYPosicionCorrecta() {
        assertTrue(excelPage.validarColumnaEstadoPosicionYDatos());
    }
}