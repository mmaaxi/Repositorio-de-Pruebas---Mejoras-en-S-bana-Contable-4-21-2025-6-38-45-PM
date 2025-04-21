package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("I navigate to the Canned Reports Module")
    public void iNavigateToTheCannedReportsModule() {
        page.openCannedReportsModule(driver);
    }

    @When("I select Module Claim > Report Code > Claim Accounting Report")
    public void iSelectModuleClaimReportCodeClaimAccountingReport() {
        page.selectClaimAccountingReport();
    }

    @When("I click on 'Submit' and then 'View Log'")
    public void iClickOnSubmitAndThenViewLog() {
        page.submitAndViewLog();
    }

    @Then("the log information related to the request should be displayed")
    public void theLogInformationShouldBeDisplayed() {
        Assert.assertTrue(page.isLogInformationDisplayed());
    }

    @When("I click on 'Add Folio' and 'Download Excel File'")
    public void iClickOnAddFolioAndDownloadExcelFile() {
        page.addFolioAndDownloadExcel();
    }

    @Then("an Excel file should be downloaded with the key modification")
    public void anExcelFileShouldBeDownloadedWithTheKeyModification() {
        Assert.assertTrue(page.isExcelFileDownloaded());
    }

    @Then("I verify that column C contains the concatenated key")
    public void iVerifyThatColumnCContainsTheConcatenatedKey() {
        Assert.assertTrue(page.isConcatenatedKeyCorrect());
    }
}