public class PracticeClass{
	//This is an example of using static keyword with variables and methods
	static int kount = 0;
	PracticeClass(){
		countingNumber();
	}
	public static void countingNumber(){
		kount++;
	}
    public static void main(String[] args ){
		int i;
		System.out.println("This is starting at "+PracticeClass.kount);
		for(i = 0; i < 10; i++){
			new PracticeClass();
		}
		System.out.println("This is ending at "+PracticeClass.kount);
	}
}