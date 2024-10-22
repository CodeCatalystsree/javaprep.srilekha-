import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        int num1=0;
        int num2=1;
        int count=2;
        while(count<=n) {
        	int temp=num2;
        	num2=num2+num1;
        	num1=temp;
        	count++;
        }
        System.out.println("the nth fibonacci number is:"+num2);
	}

}
