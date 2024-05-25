package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void passText(WebElement e, String data) {

		e.sendKeys(data);
	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();

	}

	public static void titleGet(WebElement e) {
		driver.getTitle();
	}

	public static String getAttribute(WebElement e, String name) {
		String attribute = e.getAttribute(name);
		return attribute;
	}

	public static void createExcelFile(int rowno, int cellno, String value) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BaseMaven\\Excel\\Detalis.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Datas");
		Row createRow = createSheet.createRow(rowno);
		Cell createCell = createRow.createCell(cellno);
		createCell.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);
	}

	public static void CreateRow(int rowno, int cellno, String value) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BaseMaven\\Excel\\Detalis.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Datas");
		Row createRow = sheet.createRow(rowno);
		Cell createCell = createRow.createCell(cellno);
		createCell.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);

	}

	public static void createCell(int rowno, int cellno, String value) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BaseMaven\\Excel\\Detalis.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Datas");
		Row row = sheet.getRow(rowno);
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);
	}

	public static void rewriteDataCellValue(int rowno, int cellno, String OldData, String NewData) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BaseMaven\\Excel\\Detalis.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Datas");
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String s = cell.getStringCellValue();
		if (s.equals(OldData)) {
			cell.setCellValue(NewData);

		}
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);
	}

}
