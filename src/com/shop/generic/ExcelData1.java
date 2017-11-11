package com.shop.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData1 {
	/*public static String Getdata(String sheet,int row,int coloumn) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(Autoconstant.path);
		Workbook wf=WorkbookFactory.create(fis);
		String data=wf.getSheet(sheet).getRow(row).getCell(coloumn).getStringCellValue();
		return data;
		
	}*/

	public static String Getdata(String sheet, int row, int coloumn) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(Autoconstant.path);
		Workbook wf=WorkbookFactory.create(fis);
		String data=wf.getSheet(sheet).getRow(row).getCell(coloumn).getStringCellValue();
		return data;
	}
	

}
