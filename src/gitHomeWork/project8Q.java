package gitHomeWork;

public class project8Q {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		
		int k=0, a=1, b=1;
		System.out.print("1  1  ");
		while(k<=50) {
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
	}

}
