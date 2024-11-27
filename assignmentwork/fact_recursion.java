import java.util.Scanner;

public class Factorial {

	static int factNUM(int n) {
		if(n==1 || n==0) {
			return n;
		}
		else
		return n*factNUM(n-1);	
	}
	public static void main(String[] args) {
		//Write a Java program to find the factorial of a number using Recursion
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int ans=factNUM(num);
		System.out.println(ans);
        input.close();
	}
