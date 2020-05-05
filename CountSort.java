import java.util.Arrays;

public class CountSort {
	static void countSort(int[] arr) {
		int max= 0;
		int[] size;
		int i;
		for(i= 0; i< arr.length; i++) {
			if(max<arr[i]) max= arr[i];
		}
		max++;
		size= new int[max];
		Arrays.fill(size, -1);
//		for(i= 0; i< max; i++)
//			System.out.print(size[i]+" ");
//		
		for(i= 0; i< arr.length; i++) {
			if(size[arr[i]]== -1) 
				size[arr[i]]+=2;
			else
				size[arr[i]]++;
		}
			
		
		for(i= 0; i< max; i++)
			System.out.println(size[i]);
		
		for(i= 0; i< max-1; i++)
			size[i+1]+=size[i];
		
		for(i= 0; i< max; i++)
			System.out.println(size[i]);
		
		
		for(i= max-2; i>= 0; i--)
			size[i+1]= size[i];
		
		for(i= 0; i< max; i++)
			System.out.println(size[i]);
		
		for(i= 0; i< max-1; i++) 
			if(size[i]>= 0 && size[i+1]>= 0) 
				for(int j= size[i]; j<size[i+1]; j++) 
					arr[j]= i;
		if(size[max-1]>= 0)
			for(int j= size[max-1]; j<arr.length; j++)
				arr[j]= max-1;
		
		
	}
	public static void main(String[] args) {
		int arr[]= {0, 0, 4, 2, 1, 4, 5, 1, 4, 3, 2, 2};
		countSort(arr);
		for(int i= 0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
