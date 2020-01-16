package com.testng;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class Test_Test_First {

	// test case 1
	@Test
	public void testCase1() throws FileNotFoundException, IOException {
		System.out.println("in test case 1");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Java Books");

		Object[][] bookData = {
				{"Head First Java", "Kathy Serria", 79},
				{"Effective Java", "Joshua Bloch", 36},
				{"Clean Code", "Robert martin", 42},
				{"Thinking in Java", "Bruce Eckel", 35},
		};

		int rowCount = 0;

		for (Object[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			for (Object field : aBook) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}

		}


		try (FileOutputStream outputStream = new FileOutputStream("JavaBooks1.xlsx")) {
			workbook.write(outputStream);
		}
	}

	// test case 2
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}


}
