import java.util.Scanner;

public class Fibonacci {
	public static int fiboNUM(int n) {
		if(n<2) {
			return n;
		}
		else
		return fiboNUM(n-1)+fiboNUM(n-2);
	}

	public static void main(String[] args) {
		// Write a Java program to calculate Fibonacci Series up to n numbers.
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int ans=fiboNUM(num);
		System.out.println(ans);
        input.close();
	}
