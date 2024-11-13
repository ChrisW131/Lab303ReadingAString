//System.in -  creates a standard input stream that is already open and ready to supply input data.

// The scanner is a simple text scanner that can parse primitive types and strings using regular expressions.
// So, passing System.in to Scanner allows us to parse or read strings from the standard input stream, which is the console.

import java.util.Scanner;

public class ReadingStringFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       System.out.print("Enter three words separated by spaces: ");
	       String s1 = input.next();
	       String s2 = input.next();
	       String s3 = input.next();
	       System.out.println("s1 is " + s1);
	       System.out.println("s2 is " + s2);
	       System.out.println("s3 is " + s3);

	       Scanner input1 = new  Scanner(System.in);
	       System.out.print("Enter a character: ");
	       String s = input1.nextLine();
	       char ch = s.charAt(0);
	       System.out.println("The character entered is " + ch);

		

	}

}
