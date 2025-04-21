package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("El usuario ejecuta la exportación del Excel")
    public void el_usuario_ejecuta_la_exportacion_del_excel() {
        page.iniciarExportacionExcel();
    }

    @When("El archivo Excel se genera sin errores")
    public void el_archivo_excel_se_genera_sin_errores() {
        Assert.assertTrue("El archivo Excel no se generó correctamente", page.esExcelGeneradoSinErrores());
    }

    @Then("Verificar que las columnas 'Folio Pre solicitud' y 'Folio de Pago' aparecen en las posiciones correctas")
    public void verificar_columnas_hoja_excel() {
        Assert.assertTrue("Las columnas no aparecen en las posiciones correctas", page.verificarColumnasExcel());
    }
}