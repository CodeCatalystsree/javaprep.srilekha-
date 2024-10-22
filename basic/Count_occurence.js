import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=1234988;
		System.out.print("enter the number you want to count: ");
		int n=input.nextInt();
		int count=0;
		while(number>0) {
			int rem=number%10;
			if(rem==n) {
				count++;
			}
			number=number/10;
		}
		System.out.println(count);
		

}
}
