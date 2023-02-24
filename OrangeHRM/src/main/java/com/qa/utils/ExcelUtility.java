package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static XSSFWorkbook Workbook;
	static XSSFSheet Worksheet;
	
	//System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx")
	
	public static String getStringExcelData(int RowNum, int ColNum,String ExcelSheet, int SheetNum ) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelSheet);
		Workbook=new XSSFWorkbook(Excel);
		Worksheet=Workbook.getSheetAt(SheetNum);
		
		return Worksheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
		
	}
	
	public static String getExcelData(int RowNum, int ColNum,String ExcelSheet, int SheetNum ) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelSheet);
		Workbook=new XSSFWorkbook(Excel);
		Worksheet=Workbook.getSheetAt(SheetNum);
		
		return Worksheet.getRow(RowNum).getCell(ColNum).getRawValue().toString();
		
	}

}
