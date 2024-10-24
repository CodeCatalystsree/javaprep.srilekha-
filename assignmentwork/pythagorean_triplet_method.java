import java.util.Scanner;

public class Thirteenth {
	public static boolean pythagoreanTRIPLETS(int a,int b,int c){
		int check=(a*a)+(b*b);
		int third=c*c;
		if(check==third)
		return (true);
		else
		return (false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		System.out.println("the result is:"+pythagoreanTRIPLETS(num1,num2,num3));
		input.close();
	}

}
