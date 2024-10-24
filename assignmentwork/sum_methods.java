import java.util.Scanner;

public class Twelvth {
     static int sumTWOnum(int a,int b) {
    	int sum=a+b;
    	 return sum;
     }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("THE SUM IS "+sumTWOnum(num1,num2));
       input.close();
	}

}
