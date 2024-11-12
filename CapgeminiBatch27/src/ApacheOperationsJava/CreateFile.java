package ApacheOperationsJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f=new File(System.getProperty("user.dir")+"//TestData//Capgemini.xls");
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("File is Successfully writen");

	}

}
