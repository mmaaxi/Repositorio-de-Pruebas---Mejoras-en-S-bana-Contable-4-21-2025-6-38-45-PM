package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_003Page;

public class tc_003Steps {
    private WebDriver driver;
    private WebDriverWait wait;
    private tc_003Page page;

    public tc_003Steps() {
        // Inicialización del driver y de otras variables necesarias.
        this.driver = Hooks.getDriver();
        this.wait = new WebDriverWait(driver, 10);
        this.page = new tc_003Page(driver);
    }

    @Given("el usuario navega a la página de exportación de Excel")
    public void el_usuario_navega_a_la_pagina_de_exportacion_de_Excel() {
        page.navegarPaginaExportacion();
    }

    @When("el usuario realiza la exportación del Excel")
    public void el_usuario_realiza_la_exportacion_del_Excel() {
        page.exportarExcel();
    }

    @Then("el documento se descarga sin inconvenientes")
    public void el_documento_se_descarga_sin_inconvenientes() {
        page.verificarDescargaExcel();
    }

    @Then("el usuario verifica que la columna 'estado' se actualice con los datos correctos")
    public void el_usuario_verifica_columna_estado() {
        page.verificarActualizacionColumnaEstado();
    }
}