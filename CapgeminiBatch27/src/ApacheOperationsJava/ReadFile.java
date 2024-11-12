package ApacheOperationsJava;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
public class ReadFile {
 
	static File f;
	static FileInputStream fis;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * Read Data From Excel
		 * Display all data from excel file in console
		 * =========================================================
		 * File
		 * FileInputStream
		 * ====================================================
		 * Get a Workbook   ----> HHSFWorkbook
		 * Get a sheet      ----> HSSFSheet
		 * Get a Row        ----> HSSFRow
		 * Get a Cell       ----> HSSFCell
		 *
		 */
		
		f=new File(System.getProperty("user.dir")+"//TestData/Capgemini.xls");
		fis = new FileInputStream(f);
		
		wb = new HSSFWorkbook(fis);
		sheet=wb.getSheet("LoginCredentials");
		row=sheet.getRow(0);
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
	}
 
}