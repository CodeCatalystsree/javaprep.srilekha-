import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int product=1,sum=0,result=0;
		while(num>0) {
			int rem=num%10;
			product=product*rem;
			sum=sum+rem;
		    result=(int)(product-sum);
			num=num/10;
		}
		System.out.println(product);
		System.out.println(sum);
		System.out.println(result);
	
	}

}
