package com.testng.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

import de.schlichtherle.truezip.io.SynchronizedOutputStream;
import edu.umd.cs.findbugs.annotations.Priority;

@SuppressWarnings("unused")
public class Excel_Full {

	public static String dir=System.getProperty("user.dir");
	public OutputStream xls;
	public File detele_file;
	Workbook book;
	FileOutputStream xlsx_workbook;
	Sheet sheet1;

	@Test(priority=1)
	public void create_Excel() throws FileNotFoundException
	{
		System.out.println("Path of current dir - "+dir);
		xlsx_workbook=new FileOutputStream(dir+"//Xlsx_files//Test_Data.xls");
		System.out.println("Workbook Created Successfully");

	}

	//@Test(priority=2)
	public void create_sheet() throws InterruptedException, IOException
	{
		book=new HSSFWorkbook();
		sheet1=book.createSheet("Suraj");
		book.write(xlsx_workbook);
		System.out.println("Sheets Has been Created successfully");  
	}

	@Test(priority=3)
	public void delete_excel()
	{
		detele_file=new File(dir+"//Xlsx_files//Test_Data.xls");
		detele_file.delete();
		System.out.println("Deleted successfully");
	}

}
