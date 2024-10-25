import java.util.Scanner;

public class Fourteenth {
static boolean PRIME_bw_two(int n){
	if(n<=1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	
}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		for(int i=num1;i<=num2;i++) {
			if(PRIME_bw_two(i)) {
				System.out.println("the prime numbers are:"+i);
			}
		}
		input.close();
				
	}

}
