class StaticDoubt{
	//int kount = 0;
	static int count = 0;
	public void countingNum(){
		//kount++;
		count++;
	}
	public static void kountingNum(){
		//kount++;
		count++;
	}
	public static void mian(String[] args){
		StaticDoubt stcd = new StaticDoubt();
		stcd.countingNum();
		kountingNum();
	}
}