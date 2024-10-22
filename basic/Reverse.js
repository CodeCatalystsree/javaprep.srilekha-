import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=1234988;
		while(number>0) {
			int rem=number%10;
			System.out.print(rem);
			number=number/10;
		}

	}

}
