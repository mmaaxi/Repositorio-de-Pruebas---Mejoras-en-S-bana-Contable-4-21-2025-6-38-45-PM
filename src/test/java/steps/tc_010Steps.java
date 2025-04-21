package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I am on the module page")
    public void i_am_on_the_module_page() {
        page.navigateToModulePage();
    }

    @When("I download the updated Excel file")
    public void i_download_the_updated_excel_file() {
        page.downloadExcelFile();
    }

    @Then("The document should be generated successfully with all the modifications")
    public void the_document_should_be_generated_successfully_with_all_the_modifications() {
        Assert.assertTrue(page.isExcelGeneratedSuccessfully());
    }

    @Then("A new column 'Status Pago Código' should appear to the right of 'Fecha de Pago'")
    public void a_new_column_status_pago_codigo_should_appear_to_the_right_of_fecha_de_pago() {
        Assert.assertTrue(page.isNewColumnStatusPagoCodigoPresent());
    }

    @Then("The column 'Status de Pago' should be renamed to 'Descripción Status Pago'")
    public void the_column_status_de_pago_should_be_renamed_to_descripcion_status_pago() {
        Assert.assertTrue(page.isColumnRenamedToDescripcionStatusPago());
    }
}