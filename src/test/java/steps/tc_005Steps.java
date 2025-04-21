package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import org.junit.Assert;

public class tc_005Steps {
    tc_005Page tc005Page = new tc_005Page();

    @Given("el usuario ha accedido a la opción para exportar datos a Excel")
    public void acceder_opcion_exportar_datos_excel() {
        tc005Page.navigateToExportOption();
    }

    @When("el usuario exporta el Excel con los datos actualizados")
    public void exportar_excel_datos_actualizados() {
        tc005Page.exportUpdatedExcel();
    }

    @Then("el archivo se genera correctamente")
    public void archivo_generado_correctamente() {
        Assert.assertTrue(tc005Page.isExcelGenerated());
    }

    @When("el usuario revisa el archivo Excel exportado")
    public void revisar_archivo_excel_exportado() {
        // Implementación para abrir y revisar el archivo Excel
    }

    @Then("la columna 'Monto Acumulado Folio OPC' debe renombrarse a 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void columna_renombrada_correctamente() {
        Assert.assertTrue(tc005Page.isColumnRenamedCorrectly());
    }

    @Then("el cambio de nombre debe aplicarse sin alterar los datos existentes")
    public void cambio_nombre_sin_alterar_datos() {
        Assert.assertTrue(tc005Page.isDataIntactAfterRename());
    }
}