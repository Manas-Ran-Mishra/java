// import java.io.*;
// package thisismyfirstpackage;

public class HelloWorldDemo{
    public static void main(String args[]){
        System.out.println("Hello World Demo Class");
		// printThisOutput();(can be called from main() method in this way)
    }
    public static void printThisOutput(){
	    System.out.println("Whatever in printThisOutput() is printed in HelloWorldDemo class");
	}
	// This is execuetd before main() method
	static{
		System.out.println("This is static block");
		// Calling printThisOutput() methodfrom within static block
		printThisOutput();
		// Creating object of AnotherHloWldDemo class
		AnotherHloWldDemo anth = new AnotherHloWldDemo();
		// Calling printThis() with object of AnotherHloWldDemo
		anth.printThis();
		// Creating object of Greetings class
		Greetings gtr = new Greetings();
		// Calling printThisMessage() with object of Greetings class
		gtr.printThisMessage();
	}
	// Same things can be done from inside of main() method
	// but this was just an example of using static block 
}

class AnotherHloWldDemo{
	public static void printThis(){
	    System.out.println("Another Hello World Demo Class");
	}
}