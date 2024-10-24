import java.util.Scanner;

public class Eleventh {
    static int maxNUM(int a,int b,int c){
    	int max=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
         return max;
    }
    static int minNUM(int a,int b,int c) {
    	int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        return min;
    }
	public static void main(String[] args) {
		// define two methods to find maximum and minimum number between three numbers entered by user
		Scanner input=new Scanner(System.in);
		System.out.print("enter three numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		System.out.println("The maximum number is:"+maxNUM(num1,num2,num3));
		
		System.out.println("The minimum number is:"+minNUM(num1,num2,num3));
		
		
		 input.close();
	}

}
