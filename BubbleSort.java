
public class BubbleSort {
	static void bubbleSort(int[] arr) {
		for(int i= 0; i< arr.length-1; i++)
			for(int j= 0; j< arr.length-i-1; j++)
				if(arr[j]<arr[j+1])
					arr[j]=arr[j]^arr[j+1]^(arr[j+1]=arr[j]); 
	}
	public static void main(String[] args) {
		int[] arr= {1, 2, 4, 1 , 32, 2, 52, 2};
		bubbleSort(arr);
		for(int i= 0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
