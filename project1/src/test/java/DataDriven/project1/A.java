package DataDriven.project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Hp\\Desktop\\sai project\\project1\\Excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s= w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
		//for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		//{
			//Row r=s.getRow(i);
			//for(int j=0;j<=r.getPhysicalNumberOfCells();)
		//}
	}
	

}
