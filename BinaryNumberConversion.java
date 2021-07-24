import java.util.*;
import java.lang.*;
import java.io.*;

public class BinaryNumberConversion{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println(num);
		String binStr = Integer.toBinaryString(num);
		//System.out.println(num);
		System.out.println(binStr);
		sc.close();
	}
}