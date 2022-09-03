import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) throws FileNotFoundException{
//		String value = "234A";   
//		int su = Integer.parseInt(value);
//		System.out.printf("su = %d\n", su);
		Scanner scan = new Scanner(new File("C:/Temp/sungjuk_utf8.dat"));
	}
}
