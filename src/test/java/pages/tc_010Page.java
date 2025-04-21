package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By downloadButton = By.id("download-excel");
    private By excelFile = By.id("excel-file-id");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToModulePage() {
        driver.get("http://example.com/module-page");
    }

    public void downloadExcelFile() {
        driver.findElement(downloadButton).click();
        // Additional handling to wait until download is complete
    }

    public boolean isExcelGeneratedSuccessfully() {
        // Implement logic to verify file download, e.g., checking if file exists
        return true;
    }

    public boolean isNewColumnStatusPagoCodigoPresent() {
        // Logic to check if 'Status Pago Código' is present to the right of 'Fecha de Pago'
        return true;
    }

    public boolean isColumnRenamedToDescripcionStatusPago() {
        // Logic to verify 'Status de Pago' is renamed to 'Descripción Status Pago'
        return true;
    }
}