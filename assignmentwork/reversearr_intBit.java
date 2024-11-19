import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            
            start++;
            end--;
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
