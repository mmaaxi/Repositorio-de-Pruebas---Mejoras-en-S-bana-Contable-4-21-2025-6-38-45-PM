package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page = new tc_006Page(driver);

    @When("I perform an Excel file export")
    public void perform_excel_export() {
        page.clickExportButton();
    }

    @Then("the Excel file should be downloaded successfully")
    public void verify_excel_download() {
        Assert.assertTrue(page.isExcelDownloaded());
    }

    @Then("the document should display the 'IVA 0%' column with correct amounts")
    public void verify_iva_column() {
        Assert.assertTrue(page.isColumnDisplayedWithCorrectAmounts("IVA 0%"));
    }
}