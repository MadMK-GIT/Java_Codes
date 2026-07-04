import java.util.Arrays;  //Bubble Sorting
import java.util.Scanner;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[]={22,11,44,66,33,22,1,3,37,62};
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr.length-2;j++){
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
