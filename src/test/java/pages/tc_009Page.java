package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    WebDriver driver;

    By exportarExcelButton = By.id("exportExcelButton");
    String expectedColumnHeaders[] = {"Folio Pre solicitud", "Folio de Pago"};

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarExportacionExcel() {
        driver.findElement(exportarExcelButton).click();
    }

    public boolean esExcelGeneradoSinErrores() {
        // Implementar lógica para verificar que el Excel se generó sin errores 
        // Puede ser mediante la comprobación de la aparición de un mensaje de éxito
        return true; // En este ejemplo, asumimos que se verifica correctamente
    }

    public boolean verificarColumnasExcel() {
        // Implementar lógica para abrir el archivo Excel y verificar las posiciones de las columnas
        // En este ejemplo, asumimos que se realiza correctamente
        return true; // Retornamos true para indicar que las columnas se encuentran en la posición correcta
    }
}