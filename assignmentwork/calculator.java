import java.util.Scanner;

public class Calculator {
     public static int addNUM(int x,int y) {
    	 int sum=x+y;
    	 return sum;
     }
     public static int subNUM(int x,int y) {
    	 int ans=x-y;
    	 return ans;
     }
     public static int mulNUM(int x,int y) {
    	 int ans=x*y;
    	 return ans;
     }
     public static int divNUM(int x,int y) {
    	 int ans=x/y;
    	 return ans;
     }    
	public static void main(String[] args) {
		// Write a Java program to perform basic Calculator operations
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter two numbners:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("the sum is"+addNUM(num1,num2));
		System.out.println("the subtraction is"+subNUM(num1,num2));
		System.out.println("the multiplication is"+mulNUM(num1,num2));
		System.out.println("the division is"+divNUM(num1,num2));
		
      input.close();
	}

}
