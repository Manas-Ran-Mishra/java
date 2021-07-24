public class StaticKeywordPractice{
	static int kount = 0;
	static int sum = 0;
	StaticKeywordPractice(){
		countingNumber();
		assignValue(50);
	}
	public /* static */ void countingNumber(){
		kount++;
	}
	public /* static */ void assignValue(int sumvalue){
		sum = sumvalue;
	}
    public static void main(String[] args ){
		int i,just_a_num = 0;
		System.out.println("This is starting at "+StaticKeywordPractice.kount);
		for(i = 0; i < 10; i++){
			new StaticKeywordPractice();
		}
		System.out.println("This is ending at "+StaticKeywordPractice.kount);
		StaticKeywordPractice stk = new StaticKeywordPractice();
		System.out.println("The value of static variable sum is "+StaticKeywordPractice.sum);
		stk.sum = 30;
		System.out.println("The value of static variable sum is "+StaticKeywordPractice.sum);
		StaticKeywordPractice stkagain = new StaticKeywordPractice();
		stkagain.sum = 70;
		System.out.println("The value of static variable sum is "+StaticKeywordPractice.sum);
		SecondStaticPractice scndstk = new SecondStaticPractice();
		scndstk.sumIt(45);
		just_a_num = just_a_num + scndstk.count;
		System.out.println("The value of just_a_num is "+just_a_num+" and static count variable of SecondStaticPractice class is "+scndstk.count);
		scndstk.getCount();
		SecondStaticPractice anotherscndstk = new SecondStaticPractice();
		anotherscndstk.sumIt(35);
		just_a_num = just_a_num + anotherscndstk.count;
		System.out.println("The value of just_a_num is "+just_a_num+" and static count variable of SecondStaticPractice class is "+anotherscndstk.count);
		anotherscndstk.getCount();
	}
}
class SecondStaticPractice{
	static int count = 0;
	public void sumIt(int sumval){
		count = count + sumval;
	}
	public void getCount(){
		System.out.println("The value of static count is "+count);
	}
}