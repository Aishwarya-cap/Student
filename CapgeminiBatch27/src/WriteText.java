import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("Testedata//Login.txt");
		
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		System.out.println("File is created!");

	}

}
