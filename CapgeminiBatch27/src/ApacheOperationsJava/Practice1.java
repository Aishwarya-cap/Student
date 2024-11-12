package ApacheOperationsJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Practice1 {
 
	static File f;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row, row1, row2, row3;
	static XSSFCell cell,cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8;
	
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
		
		cell1=row.createCell(1);
		cell1.setCellValue("John");
		
		cell2=row.createCell(2);
		cell2.setCellValue(802171599);
		
		cell3=row.createCell(3);
		cell3.setCellValue(25);
		
		cell4=row.createCell(4);
		cell4.setCellValue("John@123");
		
		cell5=row.createCell(5);
		cell5.setCellValue("Football");
		
		cell6=row.createCell(6);
		cell6.setCellValue("Male");
		
		cell7=row.createCell(7);
		cell7.setCellValue("Chennai");
		
		cell8=row.createCell(8);
		cell8.setCellValue("Shantinagar");
		
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