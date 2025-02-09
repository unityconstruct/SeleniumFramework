package com.uc.test.selenium.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Excelcell;
	private static XSSFRow Excelrow;

	// This method is to set the File path and to open the Excel file, Pass Excel
	// Path and Sheetname as Arguments to this method
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			// TestLog.info("Excel sheet opened");
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Excelcell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Excelcell.getStringCellValue();

			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	@SuppressWarnings("static-access")
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {

			Excelrow = ExcelWSheet.getRow(RowNum);
			Excelcell = Excelrow.getCell(ColNum, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			if (Excelcell == null) {
				Excelcell = Excelrow.createCell(ColNum);
				Excelcell.setCellValue(Result);
			} else {
				Excelcell.setCellValue(Result);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	public static int getRowContains(String sTestCaseName, int colNum) throws Exception {
		int i;
		try {
			int rowCount = ExcelUtils.getRowUsed();
			for (i = 0; i < rowCount; i++) {
				if (ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCaseName)) {
					break;
				}
			}
			return i;
		} catch (Exception e) {
			// TestLog.error("Class ExcelUtil | Method getRowContains | Exception desc : " +
			// e.getMessage());
			throw (e);
		}
	}

	public static int getRowUsed() throws Exception {
		try {
			int RowCount = ExcelWSheet.getLastRowNum();
			// TestLog.info("Total number of Row used return as < " + RowCount + " >.");
			return RowCount;
		} catch (Exception e) {
//			TestLog.error("Class ExcelUtil | Method getRowUsed | Exception desc : " + e.getMessage());
			// System.out.println(e.getMessage());
			throw (e);
		}

	}
}
