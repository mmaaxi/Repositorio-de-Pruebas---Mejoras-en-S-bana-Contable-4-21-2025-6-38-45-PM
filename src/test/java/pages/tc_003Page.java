package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    private WebDriver driver;

    private By exportExcelButton = By.id("exportExcel");
    private By descargaExitosa = By.id("descargaExitosa");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaExportacion() {
        driver.get("http://example.com/exportacion");
    }

    public void exportarExcel() {
        driver.findElement(exportExcelButton).click();
    }

    public void verificarDescargaExcel() {
        boolean descargaCorrecta = driver.findElement(descargaExitosa).isDisplayed();
        if (!descargaCorrecta) {
            throw new AssertionError("El documento no se descargó correctamente.");
        }
    }

    public void verificarActualizacionColumnaEstado() {
        // Simulación de verificación de actualización de la columna estado
        // Esto normalmente incluiría extraer los datos del Excel y verificar según historia de usuario

        // Código de verificación es ejemplo comentado abajo
        /*
        List<String> estadoValores = obtenerDatosColumnaEstado();
        for(String valor : estadoValores) {
            if (!esValorEsperado(valor)) {
                throw new AssertionError("El valor de la columna estado no es conforme: " + valor);
            }
        }
        */
    }
}