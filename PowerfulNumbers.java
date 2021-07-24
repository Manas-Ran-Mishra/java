import java.util.*;
import java.io.*;
import java.lang.*;

public class PowerfulNumbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		num = num % 10;
		if(num == 1 || num == 0 || num == 5 || num == 6){
		    System.out.println(num);
		}
		else if(num == 9 || num == 4){
		    if(pow % 2 == 0)
				power(num,2);
			else
				System.out.println(num);
		}
		else if(num ==2 || num ==3 || num ==7 || num ==8 ){
		    pow = pow % 4;
		    power(num,pow);
		}
	}
	public static void power(int num, int pow){
	    int numToThePow = 1;
	    for (int i=0; i < pow ; i++){
	        numToThePow = numToThePow * num;
	    }
	    System.out.println(numToThePow % 10);
	}
}