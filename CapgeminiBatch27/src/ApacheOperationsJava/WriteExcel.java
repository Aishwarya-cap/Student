package ApacheOperationsJava;
 
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class WriteExcel {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		data.put("2", new Object[] {1, "Amit", "Shukla"});
		data.put("3", new Object[] {2, "Lokesh", "Gupta"});
		data.put("4", new Object[] {3, "John", "Edwards"});
		data.put("5", new Object[] {4, "Brian", "Schultz"});
		
		Set<String> keySet = data.keySet();
		int rownum=0;
		
		for(String key: keySet) {
			
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum=0;
			
			for(Object obj: objArr) {
				Cell cell = row.createCell(cellnum++);
				
				if(obj instanceof String) cell.setCellValue((String) obj);
				
				else if(obj instanceof Integer) cell.setCellValue((Integer) obj);
			}
		}
		
		try {
			FileOutputStream out = new FileOutputStream(new File("TestData//howtodoinjava_demo.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("howtodoinjava_demo.xlsx written successfully");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}