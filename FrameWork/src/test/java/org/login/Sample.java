package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\monisha\\eclipse-workspace\\FrameWork\\Excel Sheet\\123.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
//		System.out.println(c);
				int type = c.getCellType();
//				String value="";
				if (type == 1) {
					 String v = c.getStringCellValue();
					System.out.println(v);
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();

					SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yy");
					 String v = sd.format(d);
					 System.out.println(v);

				}
				else {

					double e = c.getNumericCellValue();
					long l = (long) e;
					String v = String.valueOf(l);
					System.out.println(v);
				}
//				System.out.println(value);
			}
		}

	}
}

//int w1 = s.getPhysicalNumberOfRows();
//System.out.println(w1);
//Row r = null;
//int c=r.getPhysicalNumberOfCells();
