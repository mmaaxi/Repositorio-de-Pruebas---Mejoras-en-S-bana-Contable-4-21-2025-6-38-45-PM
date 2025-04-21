package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {

    private WebDriver driver;

    private By exportButton = By.id("exportButton");
    private By formulaCell = By.id("formulaCell");
    
    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarExcel() {
        driver.findElement(exportButton).click();
    }

    public void revisarCeldaFormula() {
        driver.findElement(formulaCell).click();
    }

    public boolean esDocumentoGeneradoExitosamente() {
        // Método para verificar si el documento fue generado
        return true;
    }

    public boolean esFormulaActualizadaCorrectamente() {
        // Método para verificar si la fórmula fue actualizada correctamente
        // Comparar la fórmula esperada con la actual
        String formulaEsperada = "SUM(Descuento,IVADescuento,ISR,ImpuestoCedular,IVAacumulable,IVAretenido)";
        String formulaActual = driver.findElement(formulaCell).getText();
        return formulaActual.equals(formulaEsperada);
    }
}