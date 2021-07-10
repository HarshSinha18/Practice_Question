package Rough;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer_Reader {

	public static void main(String[] args) {
		try {
			FileReader file2 = new FileReader("D://Testing.txt");
	BufferedReader file = new BufferedReader(file2);
System.out.println(file.readLine());
	
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
