package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc_004Page {
    WebDriver driver;

    private By exportButton = By.id("exportButton");
    private By columnHeader = By.xpath("//th[text()='Monto acumulado Folio Reserva 5401']");
    private By previousAmount = By.xpath("//td[@data-column='previousAmount']");
    private By currentAmount = By.xpath("//td[@data-column='currentAmount']");
    private By accumulatedAmount = By.xpath("//td[@data-column='accumulatedAmount']");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void executeExport() {
        driver.findElement(exportButton).click();
    }

    public boolean isColumnPresent() {
        List<WebElement> columns = driver.findElements(columnHeader);
        return columns.size() > 0;
    }

    public boolean isColumnValueCorrect() {
        List<WebElement> previous = driver.findElements(previousAmount);
        List<WebElement> current = driver.findElements(currentAmount);
        List<WebElement> accumulated = driver.findElements(accumulatedAmount);

        for (int i = 0; i < accumulated.size(); i++) {
            double previousValue = Double.parseDouble(previous.get(i).getText());
            double currentValue = Double.parseDouble(current.get(i).getText());
            double accumulatedValue = Double.parseDouble(accumulated.get(i).getText());

            if (accumulatedValue != previousValue + currentValue) {
                return false;
            }
        }
        return true;
    }
}