package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import org.junit.Assert;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("^el usuario ha exportado el Excel completando todas las modificaciones$")
    public void exportarExcel() {
        page.exportarExcel();
    }

    @When("^el usuario revisa la celda con la fórmula actualizada para 'Monto Acumulado Folio OPC 2121'$")
    public void revisarCelda() {
        page.revisarCeldaFormula();
    }

    @Then("^el documento se genera exitosamente$")
    public void verificarDocumentoGenerado() {
        Assert.assertTrue(page.esDocumentoGeneradoExitosamente());
    }

    @Then("^la fórmula se actualiza adecuadamente y realiza la suma con los campos: Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido$")
    public void verificarActualizacionFormula() {
        Assert.assertTrue(page.esFormulaActualizadaCorrectamente());
    }
}