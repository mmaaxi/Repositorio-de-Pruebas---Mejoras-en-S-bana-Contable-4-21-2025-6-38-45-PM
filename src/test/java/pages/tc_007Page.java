package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;

    By exportExcelButton = By.id("exportExcelButton");
    By ivaExentoColumn = By.xpath("//th[text()='IVA exento']");
    By ivaRetenidoColumn = By.xpath("//th[text()='IVA retenido']");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToModuleHomePage() {
        driver.get("http://example.com/module-home");
    }

    public void exportExcel() {
        driver.findElement(exportExcelButton).click();
        // Insert waiting logic if necessary
    }

    public void verifyExcelGeneration() {
        // Implement logic to verify that Excel is generated successfully
    }

    public void verifyIVAColumns() {
        // Implement logic to verify the appearance and correctness of IVA columns
        if(driver.findElement(ivaExentoColumn).isDisplayed() &&
            driver.findElement(ivaRetenidoColumn).isDisplayed()) {
            // Further logic here to read and verify the content
        } else {
            throw new AssertionError("IVA columns are not displayed correctly.");
        }
    }
}