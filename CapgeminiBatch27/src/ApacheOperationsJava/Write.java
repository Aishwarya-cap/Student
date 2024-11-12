package ApacheOperationsJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Write {
	static File f;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell, cell1,cell2;
	static FileOutputStream fos;
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		 f=new File(System.getProperty("user.dir")+"//TestData//Capgemini.xls");
		
		 wb=new HSSFWorkbook();
		
		
		HSSFSheet sheet=wb.createSheet("LoginCredentials");
		//System.out.println("Name of the Sheet::"+sheet.getSheetName());
		HSSFRow row=sheet.createRow(0);
		
		cell= row.createCell(0);
		cell1= row.createCell(1);
		cell2= row.createCell(2);
		
		
		cell.setCellValue("Jhon@gmail.com");
		cell1.setCellValue("12344");
		cell2.setCellValue("Solapur");
		
		
		fos=new FileOutputStream(f);
		try {
			wb.write(fos);
			System.out.println("Data is write Seccessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("File is Successfully writen");
	}

}
