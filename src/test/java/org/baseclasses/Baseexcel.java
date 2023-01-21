package org.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Baseexcel {
	public String getDataFromCell(String sheetName, int rownum, int cellnum) throws IOException {
		
		String res=null;
		
		File file = new File ("C:\\Users\\TAMILSELVAN\\eclipse-workspace\\AdactinTask\\Excel\\Adactin Datas.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = Workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		
		switch (cellType) {
		case STRING:
			res=cell.getStringCellValue();
			break;
			
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/YYYY");
				res = DateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				res = String.valueOf(round);
				}
			default:
			break;
			}
			return res;
		}
	
	// Update the Excel
	
	public void updateCell (String sheetName, int rownum, int cellnum, String oldData, String newData) throws IOException {
		
		File file = new File("C:\\Users\\TAMILSELVAN\\eclipse-workspace\\AdactinTask\\Excel\\Adactin Datas.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = Workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		Workbook.write(fileOutputStream);
		}
	
	// Write value in Excel
	
	public void writeCellData (String sheetName, int rownum, int cellnum, String data) throws IOException {
		File file = new File("C:\\Users\\TAMILSELVAN\\eclipse-workspace\\Junit\\Excel\\Adactin Datas.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook (fileInputStream);
		Sheet sheet = Workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell createCell = row.createCell(cellnum);
		createCell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		Workbook.write(fileOutputStream);
	}
}
