import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr= {7,3,4,2,6};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}
   static void bubble(int[] arr) {
	   for(int i=0;i<arr.length-1;i++) {
		   int j=1;
		   while(j<(arr.length-i-1)) {
			  if (arr[j]<arr[j-1]) {
				  swap(arr,j,j-1);
			  }
			  else {
				  j++;
			  }
		   }
	   }
   }
   static void swap(int[]arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
