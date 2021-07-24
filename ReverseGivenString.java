import java.io,*;
import java.util.*;

public class ReverseGivenString{
	public static void main(String args[]){
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		char[] revStr = str.toCharArray();
		for(int i = 0; i < revStr.length/2; i++){
			if(revStr[i] != revStr[revStr.length-1-i]){
				System.out.println("Not a Palindrome String");
				revStr[0]='N';
			}
		}
		if(revStr[0]!='N'){
			System.out.println("Palindrome String");
		}
	}
}