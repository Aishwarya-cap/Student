package ApacheOperationsJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Practice2 {
 
	static File f;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row, row1, row2, row3, row4, row5, row6, row7, row8;
	static XSSFCell cell;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		f=new File(System.getProperty("user.dir")+"//TestData/Details.xlsx");
//		fos = new FileOutputStream(f);
//		System.out.println("File is created");
		
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("EmployeeDetails");
		
		row=sheet.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue(101);
		
		row1=sheet.createRow(1);
		cell=row1.createCell(0);
		cell.setCellValue("John");
		
		row2=sheet.createRow(2);
		cell=row2.createCell(0);
		cell.setCellValue(802171599);
		
		row3=sheet.createRow(3);
		cell=row3.createCell(0);
		cell.setCellValue(25);
		
		row4=sheet.createRow(4);
		cell=row4.createCell(0);
		cell.setCellValue("John@123");
		
		row5=sheet.createRow(5);
		cell=row5.createCell(0);
		cell.setCellValue("Football");
		
		row6=sheet.createRow(6);
		cell=row6.createCell(0);
		cell.setCellValue("Male");
		
		row7=sheet.createRow(7);
		cell=row7.createCell(0);
		cell.setCellValue("Chennai");
		
		row8=sheet.createRow(8);
		cell=row8.createCell(0);
		cell.setCellValue("Shantinagar");
		
		
		
		fos = new FileOutputStream(f);
		try {
			wb.write(fos);
			System.out.println("Data is written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
