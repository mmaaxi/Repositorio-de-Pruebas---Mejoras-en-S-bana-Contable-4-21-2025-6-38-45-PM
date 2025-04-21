package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página principal del módulo")
    public void el_usuario_esta_en_la_pagina_principal_del_modulo() {
        page.navigateToModuleHomePage();
    }

    @When("el usuario exporta el archivo Excel del módulo")
    public void el_usuario_exporta_el_archivo_excel_del_modulo() {
        page.exportExcel();
    }

    @Then("el archivo Excel se genera con los datos actualizados")
    public void el_archivo_excel_se_genera_con_los_datos_actualizados() {
        page.verifyExcelGeneration();
    }

    @Then("las columnas 'IVA exento' e 'IVA retenido' aparecen con la información correcta")
    public void las_columnas_IVA_exento_e_IVA_retenido_aparecen_con_la_informacion_correcta() {
        page.verifyIVAColumns();
    }
}