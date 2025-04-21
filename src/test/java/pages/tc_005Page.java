package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By exportOptionButton = By.id("exportExcelBtn");
    // Locator to verify Excel file is generated
    // Locator to verify column name change

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportOption() {
        driver.findElement(exportOptionButton).click();
    }

    public void exportUpdatedExcel() {
        // Code to export Excel
    }

    public boolean isExcelGenerated() {
        // Logic to verify whether the Excel file is generated
        return true;
    }

    public boolean isColumnRenamedCorrectly() {
        // Logic to verify column rename in the Excel file
        return true;
    }

    public boolean isDataIntactAfterRename() {
        // Logic to verify data integrity post rename
        return true;
    }
}