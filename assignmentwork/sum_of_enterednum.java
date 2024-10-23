import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//System.out.println("enter the numbers:");
		int sum=0;
		int n;
		do {
			System.out.println("enter the numbers:");
		     n=input.nextInt();
			 sum+=n;
		}while(n!=0);
		System.out.println(sum);
	}

}

