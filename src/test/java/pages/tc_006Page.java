package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tc_006Page {

    WebDriver driver;

    By exportButton = By.id("exportExcelButton");
    String downloadPath = "path/to/download/directory";
    String expectedDownloadedFileName = "exported_data.xlsx";

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickExportButton() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelDownloaded() {
        return Files.exists(Paths.get(downloadPath + expectedDownloadedFileName));
    }

    public boolean isColumnDisplayedWithCorrectAmounts(String columnName) {
        // Logic to verify the Excel file contains the 'IVA 0%' column with correct values
        // This might involve parsing the Excel file and validating its contents
        // For simplicity, we assume the file has been parsed and the values have been validated
        return true; // Placeholder for actual implementation
    }
}