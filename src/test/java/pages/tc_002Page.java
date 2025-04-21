package pages;

import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class tc_002Page {
    private WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarDocumento() {
        // Lógica para exportar el documento Excel en la aplicación
    }

    public boolean existeColumnaEstado() {
        try {
            FileInputStream file = new FileInputStream(new File("path_to_exported_excel.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Iterator<Cell> cellIterator = row.cellIterator();

            boolean existeColumna = false;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getColumnIndex() == 9 && cell.getStringCellValue().equals("Estado Código")) {
                    existeColumna = true;
                    break;
                }
            }
            workbook.close();
            return existeColumna;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean validarColumnaEstadoPosicionYDatos() {
        try {
            FileInputStream file = new FileInputStream(new File("path_to_exported_excel.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            boolean datosCorrectos = true;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(9); // Columna J, índice 9
                if (cell == null || cell.getCellType() == CellType.BLANK) {
                    datosCorrectos = false;
                    break;
                }
            }
            workbook.close();
            return datosCorrectos;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}