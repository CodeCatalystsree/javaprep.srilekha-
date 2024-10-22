import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		//enhanced swicth-case
		Scanner input=new Scanner(System.in);
		System.out.print("enter a choice:");
		int n=input.nextInt();
		switch(n) {
		case 1,2,3,4,5 -> System.out.println("Weekdays");
		case 6,7 -> System.out.println("Weekends!");
		default ->System.out.println("no valid input");
		}
	}

}
